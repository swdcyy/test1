package djc.y;
import java.lang.Object;
import java.util.List;
import java.util.Collections;
import java.lang.String;

public final class y	// class@00222e
{
    public String cancelIcon;
    public List cards;
    public String descFontColor;
    public float descFontSize;
    public String descText;
    public String endColor;
    public List fragments;
    public String startColor;
    public String titleIcon;
    public String type;

    public void y(){
       super();
       this.type = "";
       this.titleIcon = "";
       this.cancelIcon = "";
       this.descText = "";
       this.descFontSize = 12.50f;
       this.descFontColor = "#842800";
       this.startColor = "#FFF2C6";
       this.endColor = "#FFFFFF";
       this.cards = Collections.emptyList();
       this.fragments = Collections.emptyList();
    }
    public final String a(){
       return this.cancelIcon;
    }
    public final List b(){
       return this.cards;
    }
    public final String c(){
       return this.descText;
    }
    public final List d(){
       return this.fragments;
    }
    public final String e(){
       return this.titleIcon;
    }
}
