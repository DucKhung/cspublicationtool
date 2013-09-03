package uit.tkorg.cspublicationtool.entities;
// Generated Dec 4, 2011 5:00:43 PM by Hibernate Tools 3.2.1.GA



/**
 * RankOrg generated by hbm2java
 */
public class RankOrg  implements java.io.Serializable {


     private Integer idOrg;
     private Integer publicationCount;
     private Integer citationCount;
     private int rank;
     private Integer authorCount;

    public RankOrg() {
    }

	
    public RankOrg(int rank) {
        this.rank = rank;
    }
    public RankOrg(Integer publicationCount, Integer citationCount, int rank, Integer authorCount) {
       this.publicationCount = publicationCount;
       this.citationCount = citationCount;
       this.rank = rank;
       this.authorCount = authorCount;
    }
   
    public Integer getIdOrg() {
        return this.idOrg;
    }
    
    public void setIdOrg(Integer idOrg) {
        this.idOrg = idOrg;
    }
    public Integer getPublicationCount() {
        return this.publicationCount;
    }
    
    public void setPublicationCount(Integer publicationCount) {
        this.publicationCount = publicationCount;
    }
    public Integer getCitationCount() {
        return this.citationCount;
    }
    
    public void setCitationCount(Integer citationCount) {
        this.citationCount = citationCount;
    }
    public int getRank() {
        return this.rank;
    }
    
    public void setRank(int rank) {
        this.rank = rank;
    }
    public Integer getAuthorCount() {
        return this.authorCount;
    }
    
    public void setAuthorCount(Integer authorCount) {
        this.authorCount = authorCount;
    }




}

