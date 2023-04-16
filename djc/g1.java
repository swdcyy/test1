package djc.g1;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import djc.g1$a;
import nsd.u;
import com.yxcorp.gifshow.share.widget.ImmerseSharePanelFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kwai.sharelib.model.PainterModel;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import djc.f1;
import djc.e1;
import com.google.gson.JsonObject;
import java.lang.Throwable;
import djc.c1;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import ag6.a;

public final class g1 extends RecyclerView$Adapter	// class@0021f5
{
    public List e;
    public final Map f;
    public int g;
    public final ImmerseSharePanelFragment h;
    public static final g1$a i;

    static {
       g1.i = new g1$a(null);
    }
    public void g1(ImmerseSharePanelFragment p0){
       a.p(p0, "fragment");
       super();
       this.h = p0;
       this.e = new ArrayList();
       this.f = new LinkedHashMap();
       this.g = -1;
    }
    public final ImmerseSharePanelFragment J0(){
       return this.h;
    }
    public final Map K0(){
       return this.f;
    }
    public int f0(int p0){
       List obj;
       g1 og1 = g1.class;
       if (PatchProxy.isSupport(og1)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og1, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = CollectionsKt___CollectionsKt.J5(this.e);
       int i = obj.size();
       int i1 = 2;
       if (p0 >= 0 && i > p0) {
          PainterModel mType = obj.get(p0).mType;
          if (mType != null) {
             switch (mType.hashCode()){
                 case 0x8723c747:
                   if (mType.equals("short_pic")) {
                      i1 = 4;
                   }
                   break;
                 case 0xad32d5c0:
                   if (mType.equals("big_qr")) {
                      i1 = 3;
                   }
                   break;
                 case 0xf927ddcb:
                   if (mType.equals("big_pic")) {
                      i1 = 5;
                   }
                   break;
                 case 0x6b0147b:
                   if (mType.equals("video")) {
                      i1 = 1;
                   }
                   break;
                 default:
             }
          }
       }
       return i1;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, g1.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return CollectionsKt___CollectionsKt.J5(this.e).size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       g1 og1 = g1.class;
       if (PatchProxy.isSupport(og1) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, og1, "4")) {
          return;
       }
       a.p(p0, "holder");
       List list = CollectionsKt___CollectionsKt.J5(this.e);
       int i = list.size();
       PainterModel painterModel = (p1 >= 0 && i > p1)? list.get(p1): null;
       if (painterModel != null) {
          i = p0.getItemViewType();
          if (i != 2 && (i != 3 && (i != 4 && i != 5))) {
             p0.g(painterModel, this.h);
             this.f.put(Integer.valueOf(p1), p0);
          }else {
             p0.a(painterModel, this.h, p1);
             this.f.put(Integer.valueOf(p1), p0);
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       View view;
       e1 uoe1;
       g1 og1 = g1.class;
       if (PatchProxy.isSupport(og1)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, og1, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "parent");
       if (p1 != 1) {
          view = a.c(LayoutInflater.from(p0.getContext()), R.layout.arg_RES_7f0d0626, p0, false);
          a.o(view, "LayoutInflater.from\(pare¡­er_layout, parent, false\)");
          uoe1 = new e1(this, view);
       }else {
          view = a.c(LayoutInflater.from(p0.getContext()), R.layout.arg_RES_7f0d0628, p0, false);
          a.o(view, "LayoutInflater.from\(pare¡­er_layout, parent, false\)");
          uoe1 = new f1(this, view);
       }
       return uoe1;
    }
}
