package com.yxcorp.gifshow.aggregate.relation.RelationAggregateFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import f69.c;
import e69.b;
import f69.y;
import d69.b;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import qa9.q;
import qa9.s;
import ol5.a;
import java.lang.Boolean;
import java.util.List;
import java.util.Map;
import lnc.i3;
import java.lang.System;
import y8c.g;
import com.yxcorp.gifshow.aggregate.relation.b;
import android.content.Context;
import qvb.i;
import d69.p;

public class RelationAggregateFragment extends RecyclerFragment	// class@001932
{
    public b F;
    public String G;
    public String H;
    public static final String I;

    static {
       RelationAggregateFragment.I = "RelationAggregateFragment";
    }
    public void RelationAggregateFragment(){
       super();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, RelationAggregateFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new c());
       obj.U7(new b());
       if (("beat").equals(this.G)) {
          obj.U7(new y());
       }
       PatchProxy.onMethodExit(RelationAggregateFragment.class, "3");
       return obj;
    }
    public final b Gh(){
       Bundle obj = PatchProxy.apply(null, this, RelationAggregateFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.F == null) {
          this.F = new b(this);
       }
       obj = this.getArguments();
       if (obj != null) {
          String str = obj.getString("queryUrl");
          String str1 = obj.getString("title");
          this.G = obj.getString("type");
          String str2 = obj.getString("followRefer");
          if (TextUtils.x(str1) && ("beat").equals(this.G)) {
             str1 = a1.p(R.string.arg_RES_7f10180c);
          }
          String str3 = obj.getString("materialType");
          String str4 = obj.getString("materialTitle");
          String str5 = obj.getString("materialUrl");
          RelationAggregateFragment tF = this.F;
          if (str == null) {
             str = "";
          }
          tF.i = str;
          if (str1 == null) {
             str1 = "";
          }
          tF.b = str1;
          RelationAggregateFragment tG = this.G;
          if (tG == null) {
             tG = "";
          }
          tF.c = tG;
          if (str2 == null) {
             str2 = "";
          }
          tF.d = str2;
          tF.j = TextUtils.k(str3);
          this.F.k = TextUtils.k(str4);
          this.F.l = TextUtils.k(str5);
          q oq = s.a(this);
          if (oq != null) {
             this.F.f = oq.a("param_callback", a.class);
          }
       }else {
          s.b(this);
       }
       return this.F;
    }
    public boolean Hh(){
       RelationAggregateFragment obj = PatchProxy.apply(null, this, RelationAggregateFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.F;
       boolean b = false;
       if (obj == null || (TextUtils.x(obj.k) || (!TextUtils.x(this.F.j) && !TextUtils.x(this.F.l)))) {
          b j = this.F.j;
          if (!TextUtils.n(String.valueOf(1), j) && (TextUtils.n(String.valueOf(2), j) || TextUtils.n(String.valueOf(3), j))) {
             b = true;
          }
       }
    label_005c :
       return b;
    }
    public int M(){
       return 1;
    }
    public boolean S1(){
       return false;
    }
    public boolean Xg(){
       return false;
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, RelationAggregateFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       obj.add(this.Gh());
       return obj;
    }
    public int getLayoutResId(){
       return 0x7f0d12f5;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RelationAggregateFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(RelationAggregateFragment.class, null);
       return objectsByTag;
    }
    public String getPageParams(){
       i3 obj = PatchProxy.apply(null, this, RelationAggregateFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       obj.d("type", this.G);
       return obj.e();
    }
    public String h5(){
       Object obj = PatchProxy.apply(null, this, RelationAggregateFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.H == null) {
          this.H = String.valueOf(System.currentTimeMillis());
       }
       return this.H;
    }
    public String o(){
       Object obj = PatchProxy.apply(null, this, RelationAggregateFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.Hh()) {
          return "FRIENDS_RECORD_PANEL";
       }
       return "LIKE_PHOTO_LIST";
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, RelationAggregateFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[]{this.Gh()};
       return new b(this.getContext(), s.a(this), objArray);
    }
    public i yh(){
       p op = PatchProxy.apply(null, this, RelationAggregateFragment.class, "5");
       if (op != PatchProxyResult.class) {
       }else {
          op = new p(this.Gh().i);
          this.Gh().g = op;
       }
       return op;
    }
}
