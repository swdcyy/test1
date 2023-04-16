package jf1.i;
import o81.d;
import o81.f;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import o81.g;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.chat.LiveChatWithGuestApplyMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.textstyle.LiveSpannable;
import hf1.f;
import com.kuaishou.live.basic.textstyle.LiveSpannable$b;
import com.kuaishou.live.basic.textstyle.LiveSpannable$a;
import jf1.i$a;
import android.text.style.ClickableSpan;
import android.text.SpannableStringBuilder;

public class i implements d	// class@002b6e
{
    public final f a;

    public void i(){
       super(null);
    }
    public void i(f p0){
       super();
       this.a = p0;
    }
    public CharSequence a(QLiveMessage p0,g p1){
       return this.b(p0, p1);
    }
    public CharSequence b(LiveChatWithGuestApplyMessage p0,g p1){
       int i;
       i obj = PatchProxy.applyTwoRefs(p0, p1, this, i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj != null) {
          obj.a(p0);
       }
       LiveSpannable liveSpannabl = new LiveSpannable();
       f.b(p0, liveSpannabl, p1);
       LiveSpannable$b uob = f.c(p0.getContentString(), p1);
       LiveSpannable$b uob1 = f.c(p0.getNameString(), p1);
       if (p1.p()) {
          uob.d(p1.k());
          uob1.d(p1.h());
       }else {
          i = 0x7f060871;
          uob.d(i);
          uob1.d(i);
       }
       if (p1.p()) {
          liveSpannabl.j(uob1).e().j(uob);
       }else {
          liveSpannabl.j(uob1).j(uob);
       }
       if (p0.mShouldShowButton != null && this.a != null) {
          LiveSpannable$a uoa = p1.e(R.string.arg_RES_7f102e03);
          if (p1.n()) {
             liveSpannabl.c();
          }else {
             liveSpannabl.d();
          }
          uoa.a(new i$a(this, p0, p1));
          liveSpannabl.h(uoa);
          p0.setHasLastButton(true);
       }
       return liveSpannabl.k();
    }
}
