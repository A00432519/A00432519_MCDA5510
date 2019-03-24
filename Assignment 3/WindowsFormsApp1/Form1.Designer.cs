namespace WindowsFormsApp1
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.cid = new System.Windows.Forms.TextBox();
            this.firstname = new System.Windows.Forms.TextBox();
            this.lname = new System.Windows.Forms.TextBox();
            this.strtno = new System.Windows.Forms.TextBox();
            this.fname = new System.Windows.Forms.Label();
            this.Next = new System.Windows.Forms.Button();
            this.Previous = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            this.label8 = new System.Windows.Forms.Label();
            this.label9 = new System.Windows.Forms.Label();
            this.label10 = new System.Windows.Forms.Label();
            this.street = new System.Windows.Forms.TextBox();
            this.city = new System.Windows.Forms.TextBox();
            this.Province = new System.Windows.Forms.TextBox();
            this.country = new System.Windows.Forms.TextBox();
            this.postalcode = new System.Windows.Forms.TextBox();
            this.phoneno = new System.Windows.Forms.TextBox();
            this.email = new System.Windows.Forms.TextBox();
            this.label11 = new System.Windows.Forms.Label();
            this.status = new System.Windows.Forms.Label();
            this.status1 = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // cid
            // 
            this.cid.Location = new System.Drawing.Point(236, 66);
            this.cid.Name = "cid";
            this.cid.Size = new System.Drawing.Size(100, 22);
            this.cid.TabIndex = 0;
            // 
            // firstname
            // 
            this.firstname.Location = new System.Drawing.Point(236, 131);
            this.firstname.Name = "firstname";
            this.firstname.Size = new System.Drawing.Size(100, 22);
            this.firstname.TabIndex = 1;
            // 
            // lname
            // 
            this.lname.Location = new System.Drawing.Point(236, 180);
            this.lname.Name = "lname";
            this.lname.Size = new System.Drawing.Size(100, 22);
            this.lname.TabIndex = 2;
            // 
            // strtno
            // 
            this.strtno.Location = new System.Drawing.Point(236, 237);
            this.strtno.Name = "strtno";
            this.strtno.Size = new System.Drawing.Size(100, 22);
            this.strtno.TabIndex = 3;
            // 
            // fname
            // 
            this.fname.AutoSize = true;
            this.fname.Location = new System.Drawing.Point(74, 131);
            this.fname.Name = "fname";
            this.fname.Size = new System.Drawing.Size(76, 17);
            this.fname.TabIndex = 4;
            this.fname.Text = "First Name";
            // 
            // Next
            // 
            this.Next.Location = new System.Drawing.Point(599, 240);
            this.Next.Name = "Next";
            this.Next.Size = new System.Drawing.Size(75, 23);
            this.Next.TabIndex = 5;
            this.Next.Text = "Next";
            this.Next.UseVisualStyleBackColor = true;
            this.Next.Click += new System.EventHandler(this.Next_Click);
            // 
            // Previous
            // 
            this.Previous.Location = new System.Drawing.Point(599, 394);
            this.Previous.Name = "Previous";
            this.Previous.Size = new System.Drawing.Size(75, 23);
            this.Previous.TabIndex = 6;
            this.Previous.Text = "Previous";
            this.Previous.UseVisualStyleBackColor = true;
            this.Previous.Click += new System.EventHandler(this.Previous_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(74, 180);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(76, 17);
            this.label1.TabIndex = 8;
            this.label1.Text = "Last Name";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(74, 69);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(87, 17);
            this.label2.TabIndex = 9;
            this.label2.Text = "Customer_Id";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(74, 293);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(46, 17);
            this.label3.TabIndex = 10;
            this.label3.Text = "Street";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(74, 240);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(104, 17);
            this.label4.TabIndex = 11;
            this.label4.Text = "Street_Number";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(74, 341);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(31, 17);
            this.label5.TabIndex = 12;
            this.label5.Text = "City";
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(74, 385);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(63, 17);
            this.label6.TabIndex = 13;
            this.label6.Text = "Province";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(74, 431);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(57, 17);
            this.label7.TabIndex = 14;
            this.label7.Text = "Country";
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Location = new System.Drawing.Point(74, 480);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(88, 17);
            this.label8.TabIndex = 15;
            this.label8.Text = "Postal_Code";
            // 
            // label9
            // 
            this.label9.AutoSize = true;
            this.label9.Location = new System.Drawing.Point(74, 520);
            this.label9.Name = "label9";
            this.label9.Size = new System.Drawing.Size(107, 17);
            this.label9.TabIndex = 16;
            this.label9.Text = "Phone_Number";
            // 
            // label10
            // 
            this.label10.AutoSize = true;
            this.label10.Location = new System.Drawing.Point(73, 554);
            this.label10.Name = "label10";
            this.label10.Size = new System.Drawing.Size(47, 17);
            this.label10.TabIndex = 17;
            this.label10.Text = "E-Mail";
            // 
            // street
            // 
            this.street.Location = new System.Drawing.Point(236, 293);
            this.street.Name = "street";
            this.street.Size = new System.Drawing.Size(100, 22);
            this.street.TabIndex = 18;
            // 
            // city
            // 
            this.city.Location = new System.Drawing.Point(236, 341);
            this.city.Name = "city";
            this.city.Size = new System.Drawing.Size(100, 22);
            this.city.TabIndex = 19;
            // 
            // Province
            // 
            this.Province.Location = new System.Drawing.Point(236, 382);
            this.Province.Name = "Province";
            this.Province.Size = new System.Drawing.Size(100, 22);
            this.Province.TabIndex = 20;
            // 
            // country
            // 
            this.country.Location = new System.Drawing.Point(236, 431);
            this.country.Name = "country";
            this.country.Size = new System.Drawing.Size(100, 22);
            this.country.TabIndex = 21;
            // 
            // postalcode
            // 
            this.postalcode.Location = new System.Drawing.Point(236, 480);
            this.postalcode.Name = "postalcode";
            this.postalcode.Size = new System.Drawing.Size(100, 22);
            this.postalcode.TabIndex = 22;
            // 
            // phoneno
            // 
            this.phoneno.Location = new System.Drawing.Point(236, 520);
            this.phoneno.Name = "phoneno";
            this.phoneno.Size = new System.Drawing.Size(100, 22);
            this.phoneno.TabIndex = 23;
            // 
            // email
            // 
            this.email.Location = new System.Drawing.Point(236, 554);
            this.email.Name = "email";
            this.email.Size = new System.Drawing.Size(100, 22);
            this.email.TabIndex = 24;
            // 
            // label11
            // 
            this.label11.AutoSize = true;
            this.label11.Location = new System.Drawing.Point(0, 0);
            this.label11.Name = "label11";
            this.label11.Size = new System.Drawing.Size(54, 17);
            this.label11.TabIndex = 25;
            this.label11.Text = "label11";
            // 
            // status
            // 
            this.status.AutoSize = true;
            this.status.Location = new System.Drawing.Point(74, 590);
            this.status.Name = "status";
            this.status.Size = new System.Drawing.Size(48, 17);
            this.status.TabIndex = 26;
            this.status.Text = "Status";
            // 
            // status1
            // 
            this.status1.Location = new System.Drawing.Point(236, 590);
            this.status1.Name = "status1";
            this.status1.Size = new System.Drawing.Size(438, 22);
            this.status1.TabIndex = 27;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 632);
            this.Controls.Add(this.status1);
            this.Controls.Add(this.status);
            this.Controls.Add(this.label11);
            this.Controls.Add(this.email);
            this.Controls.Add(this.phoneno);
            this.Controls.Add(this.postalcode);
            this.Controls.Add(this.country);
            this.Controls.Add(this.Province);
            this.Controls.Add(this.city);
            this.Controls.Add(this.street);
            this.Controls.Add(this.label10);
            this.Controls.Add(this.label9);
            this.Controls.Add(this.label8);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.Previous);
            this.Controls.Add(this.Next);
            this.Controls.Add(this.fname);
            this.Controls.Add(this.strtno);
            this.Controls.Add(this.lname);
            this.Controls.Add(this.firstname);
            this.Controls.Add(this.cid);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox cid;
        private System.Windows.Forms.TextBox firstname;
        private System.Windows.Forms.TextBox lname;
        private System.Windows.Forms.TextBox strtno;
        private System.Windows.Forms.Label fname;
        private System.Windows.Forms.Button Next;
        private System.Windows.Forms.Button Previous;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.Label label9;
        private System.Windows.Forms.Label label10;
        private System.Windows.Forms.TextBox street;
        private System.Windows.Forms.TextBox city;
        private System.Windows.Forms.TextBox Province;
        private System.Windows.Forms.TextBox country;
        private System.Windows.Forms.TextBox postalcode;
        private System.Windows.Forms.TextBox phoneno;
        private System.Windows.Forms.TextBox email;
        private System.Windows.Forms.Label label11;
        private System.Windows.Forms.Label status;
        private System.Windows.Forms.TextBox status1;
    }
}

