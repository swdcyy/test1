package ac9.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public abstract class g	// class@00007f
{
    public int b;
    public boolean c;
    public int reason;
    public String title;

    public void g(){
       super();
       this.title = "";
       this.b = 1;
    }
    public final int getReason(){
       return this.reason;
    }
    public final int getRecognitionType(){
       return this.b;
    }
    public abstract String getTemplateId();
    public abstract String getTemplateName();
    public final String getTitle(){
       return this.title;
    }
    public abstract int getType();
    public final boolean isPartitionItem(){
       return this.c;
    }
    public final void setPartitionItem(boolean p0){
       this.c = p0;
    }
    public final void setReason(int p0){
       this.reason = p0;
    }
    public final void setRecognitionType(int p0){
       this.b = p0;
    }
    public final void setTitle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.title = p0;
       return;
    }
}
