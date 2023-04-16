package com.yxcorp.gifshow.v3.editor.clip_v3.view.ClipFragmentV3$b;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.clip_v3.view.ClipFragmentV3;
import java.lang.Object;
import bpc.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import yoc.h;
import bpc.f;
import java.util.List;
import fpc.a;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import com.yxcorp.gifshow.v3.editor.clip_v3.ClipUtils;
import java.lang.System;
import opc.f;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import java.util.Iterator;
import java.lang.Iterable;
import ei0.a;
import npc.e;

public final class ClipFragmentV3$b implements Observer	// class@000e11
{
    public final ClipFragmentV3 b;

    public void ClipFragmentV3$b(ClipFragmentV3 p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       String str3;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipFragmentV3$b.class, str)) {
       }else if(!p0.h()){
          ClipFragmentV3$b tb = this.b;
          String str1 = "newState";
          a.o(p0, str1);
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, ClipFragmentV3.class, "6")) {
             h b = h.b;
             Objects.requireNonNull(b);
             if (!PatchProxy.applyVoidOneRefs(p0, b, h.class, str)) {
                a.p(p0, str1);
                ClipFragmentV3$b uob = 0x7f1005e8;
                int i = 3000;
                long l = 1;
                String str2 = "KSToast.applyStyle\(R.sty¡­,otherDisableToastString\)";
                switch (p0.i){
                    case 1:
                      if ((System.currentTimeMillis() - h.a) - (long)i > 0) {
                         i.d(R.style.arg_RES_7f11066a, ClipUtils.c.b());
                         h.a = System.currentTimeMillis();
                      }
                      break;
                    case 2:
                      if ((System.currentTimeMillis() - h.a) - (long)i > 0) {
                         i.d(R.style.arg_RES_7f11066a, a1.p(uob));
                         h.a = System.currentTimeMillis();
                      }
                      break;
                    case 3:
                      a.o(i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f1005ee)), "KSToast.applyStyle\(R.sty¡­ing.clip_unable_to_undo\)\)");
                      break;
                    case 4:
                      str3 = p0.e().f().get(p0.e().c()).h();
                      if (str3.length()) {
                         l = 0;
                      }
                      if (l) {
                         str3 = a1.p(R.string.arg_RES_7f100c89);
                         a.o(str3, "CommonUtil.string\(R.stri¡­split_asset_duration_tip\)");
                      }
                      a.o(i.d(R.style.arg_RES_7f11066a, str3), str2);
                      break;
                    case 5:
                      a.o(i.d(R.style.arg_RES_7f11066a, ClipUtils.c.b()), "KSToast.applyStyle\(R.sty¡­MaxDurationToastString\(\)\)");
                      break;
                    case 6:
                      a.o(i.d(R.style.arg_RES_7f11066a, a1.p(uob)), "KSToast.applyStyle\(R.sty¡­peed_min_duration_limit\)\)");
                      break;
                    case 10:
                      str3 = p0.e().f().get(p0.e().c()).h();
                      if (str3.length()) {
                         l = 0;
                      }
                      if (l) {
                         if (p0.e().e() - 0x3ff0000000000000 < 0) {
                            str3 = a1.p(R.string.arg_RES_7f1005ec);
                            a.o(str3, "CommonUtil.string\(R.stri¡­o_short_after_delete_tip\)");
                         }else {
                            str3 = a1.p(R.string.arg_RES_7f100bb8);
                            a.o(str3, "CommonUtil.string\(R.string.edit_page_clip\)");
                         }
                      }
                      a.o(i.d(R.style.arg_RES_7f11066a, str3), str2);
                      break;
                    case 11:
                      a.o(i.d(R.style.arg_RES_7f11066a, p0.e().f().get(p0.e().c()).h()), str2);
                      break;
                    case 12:
                      str3 = p0.e().f().get(p0.e().c()).h();
                      if (str3.length()) {
                         l = 0;
                      }
                      if (l) {
                         str3 = a1.p(R.string.arg_RES_7f1014f4);
                         a.o(str3, "CommonUtil.string\(R.stri¡­ghlights_not_support_tip\)");
                      }
                      a.o(i.d(R.style.arg_RES_7f11066a, str3), "KSToast.applyStyle\(R.sty¡­ otherDisableToastString\)");
                      break;
                    default:
                }
             }
          }
          c uoc = ClipFragmentV3.yh(this.b).u0();
          Iterator iterator = this.b.I.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (uoa instanceof e) {
                uoa.p(p0, uoc);
             }
          }
       }
       return;
    }
}
