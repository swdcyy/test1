package com.yxcorp.gifshow.magic.ui.magicemoji.StandardMagicFaceFragment;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceFragment;
import java.util.List;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import c4b.f;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import lnc.s6;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.CharSequence;
import android.text.TextUtils;
import o4b.a0;
import u4b.e;
import w3b.l;
import s5b.b;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import crd.b;
import java.lang.Boolean;
import android.view.View;
import androidx.fragment.app.Fragment;
import android.widget.TextView;
import q5b.f;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment$Source;
import android.os.Bundle;
import w3b.b;
import com.yxcorp.gifshow.model.MagicEmoji;
import com.yxcorp.gifshow.magic.ui.magicemoji.f;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;
import t45.d;
import brd.z;
import brd.t;
import m4b.w0;
import erd.o;
import m4b.v0;
import erd.g;
import java.util.Collections;

public class StandardMagicFaceFragment extends MagicFaceFragment	// class@001bb4
{
    public b N;
    public static final int O;

    public void StandardMagicFaceFragment(){
       super();
       this.N = null;
    }
    public final List Ah(List p0,String p1){
       Iterator iterator;
       MagicEmoji$MagicFace magicFace;
       int i3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f obj = PatchProxy.applyTwoRefs(p0, p1, this, StandardMagicFaceFragment.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = f.b();
       Objects.requireNonNull(obj);
       f uof = f.class;
       List list = PatchProxy.applyTwoRefs(p0, p1, obj, uof, "18");
       if (list != patchProxyRe) {
       }else {
          list = obj.d();
          if (q.f(p0)) {
             if (s6.h() && !PatchProxy.applyVoidOneRefs(list, obj, uof, "19")) {
                ArrayList uArrayList = q.b(list);
                if (!q.f(uArrayList)) {
                   obj.h.clear();
                   obj.i.clear();
                   iterator = uArrayList.iterator();
                   while (iterator.hasNext()) {
                      magicFace = iterator.next();
                      if (!TextUtils.isEmpty(magicFace.mChildId)) {
                         continue ;
                      }else if(a0.f().g(magicFace)){
                         obj.h.add(magicFace);
                      }else {
                         obj.i.add(magicFace);
                      }
                   }
                }
             }
          }else {
             ArrayList uArrayList1 = new ArrayList();
             ArrayList uArrayList2 = new ArrayList();
             ArrayList uArrayList3 = new ArrayList(obj.f);
             if (!q.f(uArrayList3)) {
                Iterator iterator1 = uArrayList3.iterator();
                while (iterator1.hasNext()) {
                   MagicEmoji$MagicFace magicFace1 = iterator1.next();
                   if (!e.a(magicFace1) && a0.f().g(magicFace1)) {
                      uArrayList1.add(magicFace1);
                   }
                }
             }
             iterator = p0.iterator();
             while (iterator.hasNext()) {
                MagicEmoji$MagicFace magicFace2 = iterator.next();
                if (TextUtils.isEmpty(magicFace2.mChildId) && (uArrayList1.contains(magicFace2) || uArrayList2.contains(magicFace2))) {
                   continue ;
                }else if(a0.f().g(magicFace2)){
                   uArrayList1.add(magicFace2);
                }else {
                   uArrayList2.add(magicFace2);
                }
             }
             int i = -1;
             if (!q.f(list)) {
                int i1 = list.size() + i;
                while (i1 >= 0) {
                   MagicEmoji$MagicFace magicFace3 = list.get(i1);
                   if (magicFace3 != null && TextUtils.isEmpty(magicFace3.mChildId)) {
                      int i2 = 0;
                      if (a0.f().g(magicFace3)) {
                         i3 = uArrayList1.indexOf(magicFace3);
                         if (!uArrayList3.contains(magicFace3) && i3 >= 0) {
                            i2 = uArrayList1.remove(i3);
                         }
                         if (!uArrayList1.contains(magicFace3)) {
                            if (i2 != null) {
                               magicFace3 = i2;
                            }
                            uArrayList1.add(0, magicFace3);
                         }
                      }else {
                         i3 = uArrayList2.indexOf(magicFace3);
                         if (i3 >= 0) {
                            i2 = uArrayList2.remove(i3);
                         }
                         if (i2 != null) {
                            magicFace3 = i2;
                         }
                         uArrayList2.add(0, magicFace3);
                      }
                   }
                   i1--;
                }
             }
             obj.f = new ArrayList(uArrayList1);
             int i4 = 100;
             if (uArrayList2.size() > i4) {
                uArrayList2 = uArrayList2.subList(0, i4);
             }
             if (s6.h()) {
                obj.h = q.b(uArrayList1);
                obj.i = q.b(uArrayList2);
             }
             uArrayList1.addAll(uArrayList2);
             list = new ArrayList();
             iterator = uArrayList1.iterator();
             while (iterator.hasNext()) {
                MagicEmoji$MagicFace magicFace4 = iterator.next();
                if (!l.q(magicFace4)) {
                   Object[] objArray = new Object[0];
                   b.D().w(f.j, "mine tab magicFace:"+magicFace4.getSupportedInfo()+" is not supported!", objArray);
                }else if(TextUtils.equals(magicFace4.mGroupId, p1)){
                   magicFace4 = magicFace4.clone();
                   magicFace4.mGroupId = p1;
                }
                i = i + 1;
                magicFace4.mMagicEmojiIndex = i;
                list.add(magicFace4);
             }
          }
       }
       return list;
    }
    public int ih(){
       return 0x7f0d0ec9;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, StandardMagicFaceFragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       StandardMagicFaceFragment tN = this.N;
       if (tN != null) {
          tN.dispose();
          this.N = null;
       }
       return;
    }
    public void wh(boolean p0){
       if (PatchProxy.isSupport(StandardMagicFaceFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, StandardMagicFaceFragment.class, "4")) {
          return;
       }
       if (this.getView() == null) {
          return;
       }
       if (this.A == 3) {
          TextView textView = this.getView().findViewById(R.id.tv_empty_magic_hint);
          if (textView == null) {
             return;
          }else if(f.a() && !TextUtils.x(textView.getText())){
             textView.setText(R.string.arg_RES_7f103176);
          }
          if (this.n == MagicEmojiFragment$Source.IM_CHAT) {
             textView.setText(R.string.arg_RES_7f1019be);
          }
          int i = (p0)? 0: 8;
          textView.setVisibility(i);
       }
       return;
    }
    public void yh(boolean p0){
       if (PatchProxy.isSupport(StandardMagicFaceFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, StandardMagicFaceFragment.class, "1")) {
          return;
       }
       if (this.l == null || p0) {
          Bundle arguments = this.getArguments();
          if (arguments != null) {
             this.l = b.d().b(arguments.getString("arg_category"));
          label_0033 :
             c.k(new f(this, p0));
             if (this.A != 3 || (!PatchProxy.applyVoid(null, this, StandardMagicFaceFragment.class, "2") && this.N == null)) {
                this.N = a0.f().d.observeOn(d.c).map(new w0(this)).observeOn(d.a).subscribe(new v0(this));
             }
          }
       }else {
          goto label_0033 ;
       }
       return;
    }
    public void zh(){
       List eMPTY_LIST;
       if (PatchProxy.applyVoid(null, this, StandardMagicFaceFragment.class, "3")) {
          return;
       }
       MagicFaceFragment tl = this.l;
       if (tl != null && tl.mTabType == 3) {
          this.t = this.Ah(tl.mMagicFaces, tl.mId);
       }else if(tl == null){
          eMPTY_LIST = Collections.EMPTY_LIST;
       }else {
          eMPTY_LIST = tl.mMagicFaces;
       }
       this.t = this.mh(eMPTY_LIST);
       boolean b = (!this.t.size())? true: false;
       this.wh(b);
       return;
    }
}
