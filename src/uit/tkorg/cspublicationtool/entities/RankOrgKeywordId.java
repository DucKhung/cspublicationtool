package uit.tkorg.cspublicationtool.entities;
// Generated Nov 30, 2011 8:42:51 AM by Hibernate Tools 3.2.1.GA



/**
 * RankOrgKeywordId generated by hbm2java
 */
public class RankOrgKeywordId  implements java.io.Serializable {


     private int idOrg;
     private int idKeyword;

    public RankOrgKeywordId() {
    }

    public RankOrgKeywordId(int idOrg, int idKeyword) {
       this.idOrg = idOrg;
       this.idKeyword = idKeyword;
    }
   
    public int getIdOrg() {
        return this.idOrg;
    }
    
    public void setIdOrg(int idOrg) {
        this.idOrg = idOrg;
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
		 if ( !(other instanceof RankOrgKeywordId) ) return false;
		 RankOrgKeywordId castOther = ( RankOrgKeywordId ) other; 
         
		 return (this.getIdOrg()==castOther.getIdOrg())
 && (this.getIdKeyword()==castOther.getIdKeyword());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdOrg();
         result = 37 * result + this.getIdKeyword();
         return result;
   }   


}


