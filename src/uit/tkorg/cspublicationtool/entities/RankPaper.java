package uit.tkorg.cspublicationtool.entities;
// Generated Nov 28, 2011 11:53:12 PM by Hibernate Tools 3.2.1.GA



/**
 * RankPaper generated by hbm2java
 */
public class RankPaper  implements java.io.Serializable {


     private Integer idPaper;
     private Integer citationCount;
     private int rank;

    public RankPaper() {
    }

	
    public RankPaper(int rank) {
        this.rank = rank;
    }
    public RankPaper(Integer citationCount, int rank) {
       this.citationCount = citationCount;
       this.rank = rank;
    }
   
    public Integer getIdPaper() {
        return this.idPaper;
    }
    
    public void setIdPaper(Integer idPaper) {
        this.idPaper = idPaper;
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




}

