package uit.tkorg.cspublicationtool.entities;
// Generated Dec 4, 2011 10:51:22 AM by Hibernate Tools 3.2.1.GA



/**
 * RankOrgKeyword generated by hbm2java
 */
public class RankOrgKeyword  implements java.io.Serializable {


     private RankOrgKeywordId id;
     private Integer publicationCount;
     private Integer citationCount;
     private int rank;
     private Integer authorCount;

    public RankOrgKeyword() {
    }

	
    public RankOrgKeyword(RankOrgKeywordId id, int rank) {
        this.id = id;
        this.rank = rank;
    }
    public RankOrgKeyword(RankOrgKeywordId id, Integer publicationCount, Integer citationCount, int rank, Integer authorCount) {
       this.id = id;
       this.publicationCount = publicationCount;
       this.citationCount = citationCount;
       this.rank = rank;
       this.authorCount = authorCount;
    }
   
    public RankOrgKeywordId getId() {
        return this.id;
    }
    
    public void setId(RankOrgKeywordId id) {
        this.id = id;
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

