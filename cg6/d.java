package cg6.d;
import cg6.c;
import java.lang.Object;
import y07.c;
import n07.b;
import kzc.f;
import p07.a;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import p07.d;
import java.util.HashMap;
import com.kwai.framework.ui.popupmanager.dialog.DialogConfigItem;
import java.lang.Enum;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption$ShowType;
import java.lang.Integer;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import java.util.Map;
import com.kwai.framework.ui.popupmanager.bubble.BubbleConfigItem;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption$Level;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;

public class d implements c	// class@0006bb
{
    public final f a;
    public final c b;
    public final b c;

    public void d(){
       super();
       c uoc = new c();
       this.b = uoc;
       b uob = new b();
       this.c = uob;
       this.a = new f(uoc, uob);
    }
    public void a(String p0,List p1,boolean p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, d.class, "1")) {
          return;
       }
       if (q.f(p1)) {
          return;
       }
       if (!p2 && this.b.f(p0)) {
          return;
       }
       HashMap hashMap = new HashMap();
       int i = 0;
       while (i < p1.size()) {
          DialogConfigItem uDialogConfi = p1.get(i);
          int i1 = uDialogConfi.mShowType.ordinal();
          KwaiDialogOption$ShowType[] showTypeArra = KwaiDialogOption$ShowType.values();
          if (i1 < showTypeArra.length) {
             hashMap.put(Integer.valueOf(uDialogConfi.mId), new KwaiDialogOption(showTypeArra[i1], i));
          }
          i = i + 1;
       }
       if (hashMap.isEmpty()) {
          return;
       }
       this.b.g(hashMap, p0);
       return;
    }
    public void b(String p0,List p1,boolean p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, d.class, "2")) {
          return;
       }
       if (q.f(p1)) {
          return;
       }
       if (!p2 && this.c.f(p0)) {
          return;
       }
       HashMap hashMap = new HashMap();
       int i = 0;
       while (i < p1.size()) {
          BubbleConfigItem uBubbleConfi = p1.get(i);
          KwaiBubbleOption$Level[] levelArray = KwaiBubbleOption$Level.values();
          int i1 = uBubbleConfi.mLevel.ordinal();
          if (i1 < levelArray.length) {
             hashMap.put(Integer.valueOf(uBubbleConfi.mId), new KwaiBubbleOption(levelArray[i1], i));
          }
          i = i + 1;
       }
       if (hashMap.isEmpty()) {
          return;
       }
       this.c.g(hashMap, p0);
       return;
    }
    public f c(){
       return this.a;
    }
}
