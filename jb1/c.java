package jb1.c;
import android.content.DialogInterface$OnClickListener;
import jb1.b$c;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b61.b;
import u07.t$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import y8c.r;
import android.app.Activity;
import java.lang.CharSequence;
import jb1.k;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import u07.t;
import u07.j;
import jb1.l;
import java.lang.Integer;
import jb1.j;

public final class c implements DialogInterface$OnClickListener	// class@002b0c
{
    public final b$c b;
    public final UserInfo c;

    public void c(b$c p0,UserInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(DialogInterface p0,int p1){
       t$a uoa1;
       Object[] objArray1;
       c tb = this.b;
       c tc = this.c;
       Objects.requireNonNull(tb);
       b$c uoc = b$c.class;
       if (p1 == 0x7f102cfb || p1 == 0x7f101d16) {
          if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(tc, Integer.valueOf(p1), tb, uoc, "5")) {
             t$a uoa = new t$a(tb.C());
             Object[] objArray = new Object[]{b.c(tc)};
             uoa.X0(tb.C().getString(R.string.arg_RES_7f101ff6, objArray));
             uoa.S0(R.string.arg_RES_7f103a83);
             uoa.Q0(R.string.cancel);
             uoa.u0(new j(tb, p1, tc));
             uoa.v(1);
             j.d(uoa);
          }
       }else if(p1 == 0x7f102cfd){
          if (!PatchProxy.applyVoidOneRefs(tc, tb, uoc, "9")) {
             uoa1 = new t$a(tb.C());
             objArray1 = new Object[]{b.c(tc)};
             uoa1.X0(tb.C().getString(R.string.arg_RES_7f101fed, objArray1));
             uoa1.S0(R.string.arg_RES_7f103a83);
             uoa1.Q0(R.string.cancel);
             uoa1.u0(new k(tb, tc));
             uoa1.v(1);
             j.d(uoa1);
          }
       }else if(p1 == 0x7f10406c){
          if (!PatchProxy.applyVoidOneRefs(tc, tb, uoc, "8")) {
             uoa1 = new t$a(tb.C());
             objArray1 = new Object[]{b.c(tc)};
             uoa1.X0(tb.C().getString(R.string.arg_RES_7f101fec, objArray1));
             uoa1.S0(R.string.arg_RES_7f103a83);
             uoa1.Q0(R.string.cancel);
             uoa1.u0(new l(tb, tc));
             uoa1.v(1);
             j.d(uoa1);
          }
       }else if(p1 == 0x7f1020a2){
          tb.K(tc, 1);
       }else if(p1 == 0x7f102078){
          tb.K(tc, 0);
       }else if(p1 == 0x7f1020a3){
          tb.M(tc, 1);
       }else if(p1 == 0x7f102079){
          tb.M(tc, 0);
       }else if(p1 == 0x7f1020a1){
          tb.J(tc, 1);
       }else if(p1 == 0x7f102077){
          tb.J(tc, 0);
       }else if(p1 == 0x7f102075){
          tb.L(tc, 0);
       }else if(p1 == 0x7f10209e){
          tb.L(tc, 1);
       }
       return;
    }
}
