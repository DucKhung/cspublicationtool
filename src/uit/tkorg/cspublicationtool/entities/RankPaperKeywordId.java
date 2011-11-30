package uit.tkorg.cspublicationtool.entities;
// Generated Nov 30, 2011 8:42:51 AM by Hibernate Tools 3.2.1.GA



/**
 * RankPaperKeywordId generated by hbm2java
 */
public class RankPaperKeywordId  implements java.io.Serializable {


     private int idPaper;
     private int idKeyword;

    public RankPaperKeywordId() {
    }

    public RankPaperKeywordId(int idPaper, int idKeyword) {
       this.idPaper = idPaper;
       this.idKeyword = idKeyword;
    }
   
    public int getIdPaper() {
        return this.idPaper;
    }
    
    public void setIdPaper(int idPaper) {
        this.idPaper = idPaper;
    }
    public int getIdKeyword() {
        return this.idKeyword;
    }
    
    public void setIdKeyword(int idKeyword) {
        this.idKeyword = idKeyword;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RankPaperKeywordId) ) return false;
		 RankPaperKeywordId castOther = ( RankPaperKeywordId ) other; 
         
		 return (this.getIdPaper()==castOther.getIdPaper())
 && (this.getIdKeyword()==castOther.getIdKeyword());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdPaper();
         result = 37 * result + this.getIdKeyword();
         return result;
   }   


}


