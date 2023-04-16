package jb1.y$a;
import ml8.d;
import y8c.r;
import jb1.y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import nl8.p;
import ekd.m1;
import android.widget.TextView;
import jb1.w;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.model.BlockUser;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import com.kwai.framework.model.user.User;
import android.content.Context;
import ync.a;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import jb1.x;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.gifshow.util.DateUtils;
import android.content.res.Resources;
import java.lang.System;
import java.lang.Math;
import java.lang.Integer;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;

public class y$a extends r implements d	// class@002b28
{
    public TextView i;
    public TextView j;
    public final y k;
    public static String l = "LiveBlockUserListAdapter$LiveBlockUserPresenter";

    public void y$a(y p0){
       this.k = p0;
       super();
    }
    public void A(){
       if (PatchProxy.applyVoid(null, this, y$a.class, "2")) {
          return;
       }
       this.doBindView(this.y());
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y$a.class, "1")) {
          return;
       }
       this.j = m1.f(p0, 0x7f0a01a1);
       this.i = m1.f(p0, 0x7f0a01a0);
       m1.a(p0, new w(this), R.id.item_root);
       return;
    }
    public void z(){
       String str;
       int i2;
       int i3;
       Object[] objArray;
       y$a uoa = y$a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "3")) {
          return;
       }
       BlockUser uBlockUser = this.t();
       if (uBlockUser.mAdmin == null) {
          int i = 8;
          this.j.setVisibility(i);
          this.i.setVisibility(i);
       }else {
          this.j.setVisibility(0);
          y$a tj = this.j;
          BlockUser mAdmin = uBlockUser.mAdmin;
          SpannableString spannableStr = PatchProxy.applyOneRefs(mAdmin, this, uoa, "5");
          if (spannableStr != PatchProxyResult.class) {
          }else {
             String str1 = this.C().getString(R.string.arg_RES_7f101ec7);
             String str2 = str1.replace("%1$s", mAdmin.getName());
             int i4 = str1.indexOf("%1$s");
             SpannableString spannableStr1 = new SpannableString(str2);
             int i5 = 33;
             spannableStr1.setSpan(new ForegroundColorSpan(a.c(this.C())), i4, ((mAdmin.getName()).length() + i4), i5);
             if (this.k.w != null) {
                spannableStr1.setSpan(new x(this, mAdmin), i4, ((mAdmin.getName()).length() + i4), i5);
             }
             spannableStr = spannableStr1;
          }
          tj.setText(spannableStr);
          this.i.setVisibility(0);
          uoa = this.i;
          Resources resources = a.a().a().getResources();
          long l = System.currentTimeMillis() - uBlockUser.mBlockedTime;
          long l1 = Math.abs(l);
          long l2 = 0xea60;
          if (l - l2 < 0) {
             str = resources.getString(R.string.arg_RES_7f1017e3);
          }else {
             l = 0x36ee80;
             int i1 = 1;
             if (l1 - l < 0) {
                i2 = (int)(l1 / l2);
                i3 = (i2 == i1)? 0x7f103a48: 0x7f103a4b;
                objArray = new Object[i1];
                objArray[0] = Integer.valueOf(i2);
                str = resources.getString(i3, objArray);
             }else {
                l2 = 0x5265c00;
                if (l1 - l2 < 0) {
                   i2 = (int)(l1 / l);
                   i3 = (i2 == i1)? 0x7f103a42: 0x7f103a45;
                   objArray = new Object[i1];
                   objArray[0] = Integer.valueOf(i2);
                   str = resources.getString(i3, objArray);
                }else if(l1 - 0x9fa52400 < 0){
                   i2 = (int)(l1 / l2);
                   i3 = (i2 == i1)? 0x7f103a3c: 0x7f103a3f;
                   objArray = new Object[i1];
                   objArray[0] = Integer.valueOf(i2);
                   str = resources.getString(i3, objArray);
                }else if(l1 - 0x7528ad000 < 0){
                   i2 = (int)(l1 / 0x9fa52400);
                   i3 = (i2 == i1)? 0x7f103a4f: 0x7f103a52;
                   objArray = new Object[i1];
                   objArray[0] = Integer.valueOf(i2);
                   str = resources.getString(i3, objArray);
                }else {
                   i2 = (int)(l1 / 0x7528ad000);
                   i3 = (i2 == i1)? 0x7f103a59: 0x7f103a5c;
                   objArray = new Object[i1];
                   objArray[0] = Integer.valueOf(i2);
                   str = resources.getString(i3, objArray);
                }
             }
          }
          uoa.setText(str);
       }
       if (this.k.w != null) {
          this.j.setMovementMethod(LinkMovementMethod.getInstance());
          this.j.setHighlightColor(0);
       }
       return;
    }
}
