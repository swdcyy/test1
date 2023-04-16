package bc9.k;
import y8c.g;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager;
import com.yxcorp.gifshow.camera.record.assistant.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import g9c.a;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ac9.g;
import com.yxcorp.gifshow.camera.record.assistant.model.MagicAssistantTemplate;
import com.yxcorp.gifshow.camera.record.assistant.model.MusicAssistantTemplate;
import com.yxcorp.gifshow.camera.record.assistant.model.KSAssistantTemplate;
import ac9.l;
import ac9.k;
import ac9.i;
import android.view.ViewGroup;
import y8c.f;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.camera.record.slipmode.ui.AssistantItemFrameLayout;
import bc9.a;
import bc9.f;
import bc9.h;
import bc9.f0;
import bc9.i;
import bc9.d0;
import bc9.e0;
import ml8.c;

public final class k extends g	// class@0003f2
{
    public List w;
    public final RecyclerView x;
    public final HGalleryLayoutManager y;
    public final a z;

    public void k(RecyclerView p0,HGalleryLayoutManager p1,a p2){
       a.p(p0, "recyclerView");
       a.p(p1, "hGalleryLayoutManager");
       a.p(p2, "assistantContext");
       super();
       this.x = p0;
       this.y = p1;
       this.z = p2;
    }
    public void W0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "3")) {
          return;
       }
       super.W0(p0);
       this.w = p0;
       return;
    }
    public int f0(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ok, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       g og = this.N0(p0);
       if (og instanceof MagicAssistantTemplate) {
          return 1;
       }else if(og instanceof MusicAssistantTemplate){
          return 4;
       }else if(og instanceof KSAssistantTemplate){
          return 2;
       }else if(og instanceof l){
          return -2;
       }else if(og instanceof k){
          return -124;
       }else if(og instanceof i){
          return -4;
       }else {
          return -1;
       }
    }
    public final RecyclerView h0(){
       return this.x;
    }
    public f h1(ViewGroup p0,int p1){
       a uoa;
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ok, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       AssistantItemFrameLayout uAssistantIt = a.i(p0, R.layout.arg_RES_7f0d0612);
       if (p1 != -124) {
          if (p1 != -4) {
             if (p1 != 4) {
                if (p1 != -2) {
                   if (p1 != -1) {
                      if (p1 != 1) {
                         uoa = (p1 != 2)? new a(this): new f(this);
                      }else {
                         uoa = new h(this);
                      }
                   }else {
                      uoa = new a(this);
                   }
                }else {
                   uoa = new f0(this);
                }
             }else {
                uoa = new i(this);
             }
          }else {
             uoa = new d0(this);
          }
       }else {
          uoa = new e0(this);
       }
       return new f(uAssistantIt, uoa);
    }
    public final a r1(){
       return this.z;
    }
    public final List s1(){
       return this.w;
    }
    public final HGalleryLayoutManager t1(){
       return this.y;
    }
}
