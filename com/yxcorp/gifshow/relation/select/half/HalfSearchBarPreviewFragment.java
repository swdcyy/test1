package com.yxcorp.gifshow.relation.select.half.HalfSearchBarPreviewFragment;
import com.yxcorp.gifshow.relation.select.search.SearchBarPreviewFragment;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.ContactTargetItem;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import java.lang.StringBuilder;
import java.util.Iterator;
import wkd.b;
import xac.s;
import brd.t;
import t45.d;
import brd.z;
import sbc.a;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.model.SelectUsersBundle;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import tbc.d;
import i2b.a;
import java.util.Map;
import android.graphics.drawable.Drawable;
import zf6.j;
import android.widget.ImageView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.EditText;
import y8c.g;
import com.yxcorp.gifshow.relation.select.half.HalfSearchBarPreviewFragment$a;

public class HalfSearchBarPreviewFragment extends SearchBarPreviewFragment	// class@001998
{
    public ArrayList O;
    public boolean P;
    public SelectUsersBundle Q;
    public static final int R;

    public void HalfSearchBarPreviewFragment(){
       super();
       this.O = new ArrayList();
       this.P = true;
    }
    public void Hh(ContactTargetItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HalfSearchBarPreviewFragment.class, "5")) {
          return;
       }
       super.Hh(p0);
       this.O.remove(p0);
       return;
    }
    public void Lh(Set p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HalfSearchBarPreviewFragment.class, "4")) {
          return;
       }
       if (this.P != null && p0.size() > 0) {
          StringBuilder str = "";
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             str = str+iterator.next().mId+",";
          }
          b.a(-1334121008).V1(str, "half_select_friend", "").subscribeOn(d.b).observeOn(d.a).subscribe(new a(this));
          this.P = true;
       }
       super.Lh(p0);
       return;
    }
    public final SelectUsersBundle Mh(){
       SelectUsersBundle obj = PatchProxy.apply(null, this, HalfSearchBarPreviewFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.Q == null) {
          obj = new SelectUsersBundle();
          if (this.getArguments() != null && SerializableHook.getSerializable(this.getArguments(), "key_select_users_bundle") != null) {
             obj = SerializableHook.getSerializable(this.getArguments(), "key_select_users_bundle");
          }
          this.Q = obj;
       }
       return this.Q;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, HalfSearchBarPreviewFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.h(p0, 0x7f0d05a2, p1, false, d.c(this.Mh()));
    }
    public int getLayoutResId(){
       return 0x7f0d05a2;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HalfSearchBarPreviewFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(HalfSearchBarPreviewFragment.class, null);
       return objectsByTag;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HalfSearchBarPreviewFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.G.setImageDrawable(j.j(R.drawable.common_base_search_24, 1));
       if (!TextUtils.x(this.Mh().getSearchText())) {
          this.F.setText(this.Mh().getSearchText());
       }
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, HalfSearchBarPreviewFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new HalfSearchBarPreviewFragment$a(this);
    }
}
