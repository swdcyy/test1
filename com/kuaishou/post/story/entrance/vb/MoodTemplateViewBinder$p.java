package com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$p;
import hka.a;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.a;
import androidx.fragment.app.c;
import java.util.List;
import rp4.a;
import q87.c;
import android.view.View;
import com.kuaishou.post.story.entrance.vm.MoodTemplateViewModel;
import com.kuaishou.post.story.edit.StoryEditFragment;
import u07.t$a;
import android.app.Activity;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$p$a;
import u07.u;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$p$b;
import u07.t;
import u07.j;
import lnc.d7;
import android.content.Intent;
import java.util.Objects;
import com.yxcorp.gifshow.model.config.CoinTaskConfig;
import java.lang.reflect.Type;
import oa0.a;
import lq.i;
import lq.e;
import lq.e$a;
import java.lang.Integer;
import q46.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import a17.c$a;
import java.util.ArrayList;
import a17.g;
import lnc.a1;
import com.kwai.library.widget.popup.sheet.SheetItemStatus;
import nsd.r0;
import java.util.Arrays;
import mq4.c;
import a17.b$b;
import a17.f;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.dialog.PostDialogPlugin;
import com.yxcorp.gifshow.dialog.PostDialogPlugin$DialogScenario;

public final class MoodTemplateViewBinder$p implements a	// class@000b6c
{
    public final MoodTemplateViewBinder b;

    public void MoodTemplateViewBinder$p(MoodTemplateViewBinder p0){
       this.b = p0;
       super();
    }
    public final boolean onBackPressed(){
       FragmentActivity activity;
       d7 a;
       CoinTaskConfig mRandomExitT;
       e$a uoa3;
       Object[] objArray = null;
       FragmentActivity obj = PatchProxy.apply(objArray, this, MoodTemplateViewBinder$p.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!this.b.E().isVisible()) {
          return b;
       }
       obj = this.b.E().getActivity();
       a.m(obj);
       a.o(obj, "fragment.activity!!");
       c supportFragm = obj.getSupportFragmentManager();
       a.o(supportFragm, "fragment.activity!!.supportFragmentManager");
       List fragments = supportFragm.getFragments();
       a.o(fragments, "fragment.activity!!.supp¡­FragmentManager.fragments");
       Object[] objArray1 = new Object[b];
       a.D().w("MoodTemplateViewBinder", "mBackPressable", objArray1);
       if (!this.b.v.getVisibility()) {
          this.b.D();
          return true;
       }else if(this.b.S.z0() && (fragments.size() != 2 || (fragments.get(true) instanceof StoryEditFragment || (fragments.size() == 1 && this.b.S.y0())))){
          activity = this.b.E().getActivity();
          a.m(activity);
          t$a uoa = new t$a(activity);
          uoa.y0(R.string.arg_RES_7f100b44);
          uoa.S0(R.string.arg_RES_7f101280);
          uoa.Q0(R.string.cancel);
          uoa.u0(new MoodTemplateViewBinder$p$a(this));
          uoa.t0(MoodTemplateViewBinder$p$b.b);
          j.d(uoa);
          return true;
       }else if(!this.b.S.z0() && fragments.size() == 1){
          a = d7.a;
          FragmentActivity activity1 = this.b.E().getActivity();
          Intent intent = (activity1 != null)? activity1.getIntent(): objArray;
          if (a.j(intent)) {
             MoodTemplateViewBinder$p tb = this.b;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoid(objArray, tb, MoodTemplateViewBinder.class, "3")) {
                activity = tb.R.getActivity();
                CoinTaskConfig uCoinTaskCon = a.g(CoinTaskConfig.class);
                e$a uoa1 = i.m().k().g();
                int b1 = (uoa1 != null)? d.d(Integer.valueOf(uoa1.b())): false;
                if (activity == null || (uCoinTaskCon == null || (!a.j(activity.getIntent()) || (b1 && (!TextUtils.x(uCoinTaskCon.mRandomExitTitle) && (b1 || !TextUtils.x(uCoinTaskCon.mExitTitle))))))) {
                   c$a uoa2 = new c$a(activity);
                   ArrayList uArrayList = new ArrayList();
                   String str = a1.p(R.string.arg_RES_7f100819);
                   a.o(str, "CommonUtil.string\(R.string.continue_create\)");
                   uArrayList.add(new g(str, SheetItemStatus.Primary));
                   str = a1.p(R.string.arg_RES_7f10000b);
                   a.o(str, "CommonUtil.string\(R.string.abandon_and_exit\)");
                   uArrayList.add(new g(str, SheetItemStatus.Enable));
                   if (b1) {
                      mRandomExitT = uCoinTaskCon.mRandomExitTitle;
                   }else {
                      uCoinTaskCon = uCoinTaskCon.mExitTitle;
                      b1 = 0;
                      Object[] objArray2 = new Object[true];
                      objArray2[b] = Integer.valueOf(b1);
                      str = "${%s}";
                      while (uCoinTaskCon.contains(String.format(str, objArray2))) {
                         objArray2 = new Object[true];
                         objArray2[b] = Integer.valueOf(b1);
                         Object[] objArray3 = new Object[true];
                         b1 = b1 + 1;
                         objArray3[b] = Integer.valueOf(b1);
                         String str1 = uCoinTaskCon.replace(String.format(str, objArray2), String.format("%%%s$s", objArray3));
                      }
                      a.o(uCoinTaskCon, "PostBusinessUtils.convertString\(config.mExitTitle\)");
                      Object[] objArray4 = new Object[]{Integer.valueOf(uoa3.d()),a1.p(0x7f100726)};
                      uoa3 = i.m().k().g();
                      a.m(uoa3);
                      mRandomExitT = String.format(uCoinTaskCon, Arrays.copyOf(objArray4, 2));
                      a.o(mRandomExitT, "java.lang.String.format\(format, *args\)");
                   }
                   uoa2.n0(mRandomExitT);
                   uoa2.j0(uArrayList);
                   uoa2.g0(R.string.cancel);
                   uoa2.i0(new c(activity));
                   f.a(uoa2);
                   d.a(0x34dc9f9c).xB(uoa2, PostDialogPlugin$DialogScenario.CAMERA_MOOD_BACK);
                }
             }
          label_0216 :
             return true;
          }
       }
    label_0217 :
       return b;
    }
}
