package a17.g;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.popup.sheet.SheetItemStatus;
import a17.i;

public final class g	// class@000016
{
    public final CharSequence a;
    public final i b;

    public void g(CharSequence p0){
       a.p(p0, "text");
       super(p0, SheetItemStatus.Enable);
    }
    public void g(CharSequence p0,i p1){
       a.p(p0, "text");
       a.p(p1, "itemStyleInter");
       super();
       this.a = p0;
       this.b = p1;
    }
    public void g(CharSequence p0,SheetItemStatus p1){
       a.p(p0, "text");
       a.p(p1, "status");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final i a(){
       return this.b;
    }
    public final CharSequence b(){
       return this.a;
    }
}
