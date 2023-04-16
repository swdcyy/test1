package djc.l;
import java.lang.Object;
import java.util.List;
import java.util.Collections;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class l	// class@002206
{
    public int cardCategory;
    public List iconUrls;
    public int num;
    public String text;
    public String textColor;

    public void l(){
       super();
       List list = Collections.emptyList();
       a.o(list, "Collections.emptyList\(\)");
       this.iconUrls = list;
       this.text = "";
       this.cardCategory = 1;
    }
    public final List a(){
       return this.iconUrls;
    }
    public final int b(){
       return this.num;
    }
    public final String c(){
       return this.text;
    }
}
