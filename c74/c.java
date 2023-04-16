package c74.c;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public final class c	// class@0004c7
{
    public ArrayList displayImageUrls;
    public long endTimeMills;
    public String jumpUrl;
    public String materialId;
    public String shrinkBarBackgroundColor;
    public String shrinkBarTitle;
    public long startTimeMills;
    public int weight;

    public void c(){
       super();
       this.materialId = "";
       this.jumpUrl = "";
       this.shrinkBarTitle = "";
       this.shrinkBarBackgroundColor = "";
       this.displayImageUrls = new ArrayList();
    }
    public final long a(){
       return this.endTimeMills;
    }
    public final String b(){
       return this.jumpUrl;
    }
    public final String c(){
       return this.materialId;
    }
    public final long d(){
       return this.startTimeMills;
    }
    public final void e(String p0){
       this.materialId = p0;
    }
}
