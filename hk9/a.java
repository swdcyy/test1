package hk9.a;
import kk9.a;
import android.view.View;
import com.yxcorp.gifshow.comment.editor.CommentEditorConfig;
import kk9.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hk9.y;
import android.widget.TextView;
import android.view.ViewStub;

public class a extends a	// class@002693
{
    public int a;

    public void a(){
       super();
       this.a = 0x7f0d01e7;
    }
    public void a(int p0){
       super();
       this.a = 0x7f0d01e7;
       this.a = p0;
    }
    public b a(View p0,CommentEditorConfig p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "7");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       return new y(p0, this.f(p0));
    }
    public View b(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.findViewById(0x7f0a026f);
    }
    public View c(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.findViewById(0x7f0a0cf0);
    }
    public View d(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.findViewById(0x7f0a0eb0);
    }
    public View e(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.findViewById(0x7f0a308f);
    }
    public TextView f(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.findViewById(0x7f0a0cb4);
    }
    public void g(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       p0 = p0.findViewById(R.id.ll_editor_container);
       if (p0 instanceof ViewStub) {
          p0.setLayoutResource(this.a);
          p0.inflate();
       }
       return;
    }
}
