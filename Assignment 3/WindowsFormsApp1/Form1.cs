using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }


        private void Form1_Load(object sender, EventArgs e)
        {
            using (StreamWriter sw = File.AppendText("C:\\Users\\chain\\OneDrive\\Documents\\Visual Studio 2017\\Backup Files\\WindowsFormsApp1\\LogFile.txt"))
            { 
                Customer_Details cst = new Customer_Details();
                List<customer> obj = new List<customer>();
                obj = cst.customers.ToList();
                Log(sw, "");
                Log(sw, "Form Load Successful!");


                cid.Text = obj[0].customerid.ToString();
                Log(sw, "Customer Id::"+cid.Text);
                firstname.Text = obj[0].First_name;
                Log(sw, "Firstname::"+firstname.Text);
                lname.Text = obj[0].last_name;
                Log(sw, "Lastname::"+lname.Text);
                strtno.Text = obj[0].street_no;
                Log(sw, "Streetno::"+strtno.Text);
                street.Text = obj[0].street;
                Log(sw, "Streetname::"+street.Text);
                city.Text = obj[0].city;
                Log(sw, "City::"+city.Text);
                Province.Text = obj[0].province;
                Log(sw, "Province::"+Province.Text);
                country.Text = obj[0].country;
                Log(sw, "Country::"+country.Text);
                postalcode.Text = obj[0].postal_code;
                Log(sw, "Postalcode::"+postalcode.Text);
                phoneno.Text = obj[0].phone_number;
                Log(sw, "Phoneno::"+phoneno.Text);
                email.Text = obj[0].email;
                Log(sw, "Email::"+email.Text);
                status1.Text = "";
                validateData(postalcode.Text, email.Text, phoneno.Text);
                Log(sw, "Status::" + status1.Text);

            }

        }

        private void Log(StreamWriter sw, string v)
        {
            sw.WriteLine(v);   
        }

        private string validateData(string postalcode, string email, string phoneno)
        {
            
            

                var matchepostalcode = Regex.Match(postalcode, @"^([a-zA-Z]\d[a-zA-Z]( )?\d[a-zA-Z]\d)$");
                if (!matchepostalcode.Success)
                {
                    status1.Text = "Invalid postal code ";
                   



                }
                var matchemail = Regex.Match(email, @"\A(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?)\Z", RegexOptions.IgnoreCase);
                if (!matchemail.Success)
                {
                    status1.Text = "Email Address not proper ";


                }
                var matchphoneno = Regex.Match(phoneno, @"^\(?([0-9]{3})\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$");
            if (!matchphoneno.Success)
            {
                    status1.Text = "Phone Number format not proper ";


                }

            return status1.Text;
            }

     

        private void Next_Click(object sender, EventArgs e)
        {
            using (StreamWriter sw = File.AppendText("C:\\Users\\chain\\OneDrive\\Documents\\Visual Studio 2017\\Backup Files\\WindowsFormsApp1\\LogFile.txt"))
            {
                Customer_Details cst = new Customer_Details();
                List<customer> obj = new List<customer>();
                obj = cst.customers.ToList();
                Log(sw, "");
                Log(sw,"Next Record");
                int i = 0;
                i = Convert.ToInt16(this.cid.Text) - 1;

                if (i < (obj.Count - 1))
                {
                    cid.Text = obj[i + 1].customerid.ToString();
                    Log(sw, "Customer Id::" + cid.Text);
                    firstname.Text = obj[i + 1].First_name;
                    Log(sw, "Firstname::" + firstname.Text);
                    lname.Text = obj[i + 1].last_name;
                    Log(sw, "Lastname::" + lname.Text);
                    strtno.Text = obj[i + 1].street_no;
                    Log(sw, "Streetn::" + strtno.Text);
                    street.Text = obj[i + 1].street;
                    Log(sw, "Streetname::" + street.Text);
                    city.Text = obj[i + 1].city;
                    Log(sw, "City::" + city.Text);
                    Province.Text = obj[i + 1].province;
                    Log(sw, "Province::" + Province.Text);
                    country.Text = obj[i + 1].country;
                    Log(sw, "Country::" + country.Text);
                    postalcode.Text = obj[i + 1].postal_code;
                    Log(sw, "Postalcode::" + postalcode.Text);
                    phoneno.Text = obj[i + 1].phone_number;
                    Log(sw, "Phoneno::" + phoneno.Text);
                    email.Text = obj[i + 1].email;
                    Log(sw, "Email::" + email.Text);
                    status1.Text = "";
                    validateData(postalcode.Text, email.Text, phoneno.Text);
                    Log(sw, "Status::" + status1.Text);

                }
                else
                {
                    status1.Text = "You reached the end of Records";
                    Log(sw, "You reached the end of Records");
                }
            }
        }

        private void Previous_Click(object sender, EventArgs e)
        {
            using (StreamWriter sw = File.AppendText("C:\\Users\\chain\\OneDrive\\Documents\\Visual Studio 2017\\Backup Files\\WindowsFormsApp1\\LogFile.txt"))
            {
                Customer_Details cst = new Customer_Details();
                List<customer> obj = new List<customer>();
                obj = cst.customers.ToList();
                Log(sw, "");
                Log(sw, "Previous Record");
                int i = 0;
                i = Convert.ToInt16(this.cid.Text) - 1;

                if (i != 0)
                {
                    cid.Text = obj[i - 1].customerid.ToString();
                    Log(sw, "Customer Id::" + cid.Text);
                    firstname.Text = obj[i - 1].First_name;
                    Log(sw, "Firstname::" + firstname.Text);
                    lname.Text = obj[i - 1].last_name;
                    Log(sw, "Lastname::" + lname.Text);
                    strtno.Text = obj[i - 1].street_no;
                    Log(sw, "Streetno::" + strtno.Text);
                    street.Text = obj[i - 1].street;
                    Log(sw, "Streetname::" + street.Text);
                    city.Text = obj[i - 1].city;
                    Log(sw, "City::" + city.Text);
                    Province.Text = obj[i - 1].province;
                    Log(sw, "Province::" + Province.Text);
                    country.Text = obj[i - 1].country;
                    Log(sw, "Country::" + country.Text);
                    postalcode.Text = obj[i - 1].postal_code;
                    Log(sw, "Postal Code::" + postalcode.Text);
                    phoneno.Text = obj[i - 1].phone_number;
                    Log(sw, "Phoneno::" + phoneno.Text);
                    email.Text = obj[i - 1].email;
                    Log(sw, "Email::" + email.Text);
                    status1.Text = "";
                    validateData(postalcode.Text, email.Text, phoneno.Text);
                    //Log(sw, "Status::" + status1.Text);
                }
                else
                {
                    status1.Text = "You reached the end of Records";
                    Log(sw, "You reached the end of Records");
                }
            }
        }
        
    }


}
