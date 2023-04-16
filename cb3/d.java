package cb3.d;
import vb3.g;
import eq3.d;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.LinkedHashMap;
import vb3.b;
import vb3.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import cb3.a;
import java.lang.ref.WeakReference;
import com.kuaishou.live.lite.layoutmanager.LiveLiteDialogType;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import qrd.l1;

public final class d implements g	// class@0004de
{
    public final Map a;
    public final Map b;
    public a c;
    public final d d;
    public final a e;

    public void d(d p0,a p1){
       a.p(p0, "vcManager");
       a.p(p1, "windowHeightProvider");
       super();
       this.d = p0;
       this.e = p1;
       this.a = new LinkedHashMap();
       this.b = new LinkedHashMap();
    }
    public void a(b p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "7")) {
          return;
       }
       a.p(p0, "type");
       a.p(p1, "listener");
       d tb = this.b;
       CopyOnWriteArraySet uCopyOnWrite = tb.get(p0);
       if (uCopyOnWrite == null) {
          uCopyOnWrite = new CopyOnWriteArraySet();
          tb.put(p0, uCopyOnWrite);
       }
       uCopyOnWrite.add(p1);
       return;
    }
    public void b(b p0,ViewController p1){
       d uod = d.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uod, "5")) {
          return;
       }
       a.p(p0, "type");
       a.p(p1, "viewController");
       b.c0(LiveLiteLogTag.LAYOUT_MANAGER, "DialogHostVC showDialog", "dialog type", p0);
       this.e(p0);
       a uoa = this.f(true);
       a.m(uoa);
       d uod1 = uoa.Y2();
       this.a.put(p0, new WeakReference(p1));
       if (p0 == LiveLiteDialogType.SendGiftButtonPanel) {
          uod1.G8(R.id.send_gift_button_container, p1);
       }else {
          uod1.G8(R.id.dialog_container, p1);
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, uod, "9")) {
          CopyOnWriteArraySet uCopyOnWrite = this.b.get(p0);
          if (uCopyOnWrite != null) {
             Iterator iterator = uCopyOnWrite.iterator();
             while (iterator.hasNext()) {
                iterator.next().b(p0, p1);
             }
          }
       }
       return;
    }
    public boolean c(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "type");
       return this.a.containsKey(p0);
    }
    public void d(b p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "8")) {
          return;
       }
       a.p(p0, "type");
       a.p(p1, "listener");
       d tb = this.b;
       CopyOnWriteArraySet uCopyOnWrite = tb.get(p0);
       if (uCopyOnWrite == null) {
          uCopyOnWrite = new CopyOnWriteArraySet();
          tb.put(p0, uCopyOnWrite);
       }
       uCopyOnWrite.remove(p1);
       return;
    }
    public void e(b p0){
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "6")) {
          return;
       }
       a.p(p0, "type");
       b.c0(LiveLiteLogTag.LAYOUT_MANAGER, "DialogHostVC dismissDialog", "dialog type", p0);
       WeakReference weakReferenc = this.a.remove(p0);
       if (weakReferenc != null) {
          ViewController viewControll = weakReferenc.get();
          if (viewControll != null) {
             a uoa = this.f(false);
             if (uoa != null) {
                d uod1 = uoa.Y2();
                if (uod1 != null) {
                   a.o(viewControll, "dialog");
                   uod1.o1(viewControll);
                   if (!PatchProxy.applyVoidTwoRefs(p0, viewControll, this, uod, "10")) {
                      CopyOnWriteArraySet uCopyOnWrite = this.b.get(p0);
                      if (uCopyOnWrite != null) {
                         Iterator iterator = uCopyOnWrite.iterator();
                         while (iterator.hasNext()) {
                            iterator.next().a(p0, viewControll);
                         }
                      }
                   }
                }
             }
             if (this.a.isEmpty()) {
                this.g();
             }
          }
       }
       return;
    }
    public final a f(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uod, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uod = this.c;
       if (uod != null) {
          if (uod.l == null) {
             return uod;
          }else {
             this.c = null;
          }
       }
       if (p0) {
          a uoa = new a(this.e);
          this.d.xg(uoa);
          this.c = uoa;
       }
       return this.c;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       d tc = this.c;
       if (tc != null) {
          this.d.o1(tc);
          this.c = null;
       }
       return;
    }
}
