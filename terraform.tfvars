vsphere_vcenter = "MLvCenter.vspecnynj.lab2.th3g3nt3l.com"
vsphere_user = "administrator@vspecnynj.lab2.th3g3nt3l.com"
vsphere_password = "P@ssw0rd1!"
vsphere_cluster = "VSAN-Cluster"
vsphere_datacenter = "LA_Site_2"

//data vsphere_datacenter "devlopers_area" {
//name = "LA_Site_2"
//}

data "vsphere_datacenter" "dc" {
  name = ""LA_Site_2"
}
