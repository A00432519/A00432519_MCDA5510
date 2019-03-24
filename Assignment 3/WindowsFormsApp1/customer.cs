namespace WindowsFormsApp1
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel.DataAnnotations;
    using System.ComponentModel.DataAnnotations.Schema;
    using System.Data.Entity.Spatial;

    [Table("customer")]
    public partial class customer
    {
        [DatabaseGenerated(DatabaseGeneratedOption.None)]
        public int customerid { get; set; }

        [StringLength(50)]
        public string First_name { get; set; }

        [StringLength(50)]
        public string last_name { get; set; }

        [StringLength(50)]
        public string street_no { get; set; }

        [StringLength(50)]
        public string street { get; set; }

        [StringLength(50)]
        public string city { get; set; }

        [StringLength(50)]
        public string province { get; set; }

        [StringLength(50)]
        public string country { get; set; }

        [StringLength(50)]
        public string postal_code { get; set; }

        [StringLength(50)]
        public string phone_number { get; set; }

        [StringLength(50)]
        public string email { get; set; }
    }
}
