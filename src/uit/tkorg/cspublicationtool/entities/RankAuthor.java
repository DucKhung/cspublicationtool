package uit.tkorg.cspublicationtool.entities;
// Generated Nov 30, 2011 8:42:51 AM by Hibernate Tools 3.2.1.GA



/**
 * RankAuthor generated by hbm2java
 */
public class RankAuthor  implements java.io.Serializable {


     private Integer idAuthor;
     private Integer publicationCount;
     private Integer citationCount;
     private int rank;
     private Integer coAuthorCount;

    public RankAuthor() {
    }

	
    public RankAuthor(int rank) {
        this.rank = rank;
    }
    public RankAuthor(Integer publicationCount, Integer citationCount, int rank, Integer coAuthorCount) {
       this.publicationCount = publicationCount;
       this.citationCount = citationCount;
       this.rank = rank;
       this.coAuthorCount = coAuthorCount;
    }
   
    public Integer getIdAuthor() {
        return this.idAuthor;
    }
    
    public void setIdAuthor(Integer idAuthor) {
        this.idAuthor = idAuthor;
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
    public Integer getCoAuthorCount() {
        return this.coAuthorCount;
    }
    
    public void setCoAuthorCount(Integer coAuthorCount) {
        this.coAuthorCount = coAuthorCount;
    }




}


