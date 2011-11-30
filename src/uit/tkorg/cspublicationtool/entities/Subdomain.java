package uit.tkorg.cspublicationtool.entities;
// Generated Nov 30, 2011 8:42:51 AM by Hibernate Tools 3.2.1.GA



/**
 * Subdomain generated by hbm2java
 */
public class Subdomain  implements java.io.Serializable {


     private Integer idSubdomain;
     private Domain domain;
     private String subdomainName;

    public Subdomain() {
    }

	
    public Subdomain(Domain domain) {
        this.domain = domain;
    }
    public Subdomain(Domain domain, String subdomainName) {
       this.domain = domain;
       this.subdomainName = subdomainName;
    }
   
    public Integer getIdSubdomain() {
        return this.idSubdomain;
    }
    
    public void setIdSubdomain(Integer idSubdomain) {
        this.idSubdomain = idSubdomain;
    }
    public Domain getDomain() {
        return this.domain;
    }
    
    public void setDomain(Domain domain) {
        this.domain = domain;
    }
    public String getSubdomainName() {
        return this.subdomainName;
    }
    
    public void setSubdomainName(String subdomainName) {
        this.subdomainName = subdomainName;
    }




}


