package com.yxcorp.gifshow.dialog.c;
import com.yxcorp.gifshow.dialog.PostDialogPlugin;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.dialog.PostDialogPlugin$DialogScenario;
import java.lang.Runnable;
import android.view.View;
import u07.t$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import w07.n;
import w07.l;
import u07.t;
import u07.j;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import com.kwai.robust.PatchProxyResult;
import u07.g;
import v07.f;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import u07.h;
import java.util.List;
import kotlin.Pair;
import a17.c$a;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;

public class c implements PostDialogPlugin	// class@001a9c
{

    public void c(){
       super();
    }
    public boolean Ku(Fragment p0,PostDialogPlugin$DialogScenario p1,Runnable p2,View p3){
       return false;
    }
    public void NE(t$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       p0.a0(new n());
       j.a(p0, R.layout.arg_RES_7f0d02e9);
       return;
    }
    public PopupInterface$c YI(){
       Object obj = PatchProxy.apply(null, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return g.a;
    }
    public void dn(t$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       p0.v0(new f(p0));
       p0.N0(R.layout.arg_RES_7f0d02f6);
       j.a(p0, R.layout.arg_RES_7f0d02ec);
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public PopupInterface$c kp(){
       Object obj = PatchProxy.apply(null, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.a;
    }
    public void l00(t$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       j.b(p0);
       return;
    }
    public void lV(t$a p0,PostDialogPlugin$DialogScenario p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "1")) {
          return;
       }
       j.d(p0);
       return;
    }
    public Pair sl(List p0,PostDialogPlugin$DialogScenario p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "6");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       return new Pair(p0, null);
    }
    public void xB(c$a p0,PostDialogPlugin$DialogScenario p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "5")) {
          return;
       }
       p0.X();
       return;
    }
}
