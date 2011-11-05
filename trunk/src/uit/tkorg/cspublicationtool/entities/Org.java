package uit.tkorg.cspublicationtool.entities;
// Generated Nov 5, 2011 11:29:49 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Org generated by hbm2java
 */
public class Org  implements java.io.Serializable {


     private Integer idOrg;
     private Org org;
     private String orgName;
     private String website;
     private String continent;
     private Integer HIndex;
     private String url;
     private Set authors = new HashSet(0);
     private Set orgs = new HashSet(0);

    public Org() {
    }

    public Org(Org org, String orgName, String website, String continent, Integer HIndex, String url, Set authors, Set orgs) {
       this.org = org;
       this.orgName = orgName;
       this.website = website;
       this.continent = continent;
       this.HIndex = HIndex;
       this.url = url;
       this.authors = authors;
       this.orgs = orgs;
    }
   
    public Integer getIdOrg() {
        return this.idOrg;
    }
    
    public void setIdOrg(Integer idOrg) {
        this.idOrg = idOrg;
    }
    public Org getOrg() {
        return this.org;
    }
    
    public void setOrg(Org org) {
        this.org = org;
    }
    public String getOrgName() {
        return this.orgName;
    }
    
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    public String getWebsite() {
        return this.website;
    }
    
    public void setWebsite(String website) {
        this.website = website;
    }
    public String getContinent() {
        return this.continent;
    }
    
    public void setContinent(String continent) {
        this.continent = continent;
    }
    public Integer getHIndex() {
        return this.HIndex;
    }
    
    public void setHIndex(Integer HIndex) {
        this.HIndex = HIndex;
    }
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    public Set getAuthors() {
        return this.authors;
    }
    
    public void setAuthors(Set authors) {
        this.authors = authors;
    }
    public Set getOrgs() {
        return this.orgs;
    }
    
    public void setOrgs(Set orgs) {
        this.orgs = orgs;
    }




}


