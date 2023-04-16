package com.yxcorp.gifshow.relation.explore.fragment.ContactsListFragment;
import com.yxcorp.gifshow.relation.explore.fragment.SimpleUserListFragment;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hbc.a;
import com.yxcorp.gifshow.relation.explore.fragment.a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.relation.explore.fragment.ContactsListFragment$c;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import z8c.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.res.Resources;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import com.kwai.framework.model.user.User;
import java.util.Map;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Boolean;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import wwb.f;
import android.os.Bundle;
import com.yxcorp.gifshow.relation.explore.activity.ContactsListActivity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import i2b.a;
import com.yxcorp.gifshow.relation.explore.fragment.ContactsListFragment$d;
import s2b.a;
import s2b.d;
import qvb.i;
import g9c.d;
import java.util.Objects;
import java.lang.Integer;
import android.widget.TextView;
import java.util.List;
import lnc.a1;
import java.lang.CharSequence;
import y8c.g;
import gbc.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.yxcorp.utility.TextUtils;
import im8.c;
import com.yxcorp.gifshow.relation.explore.fragment.ContactsListFragment$a;
import nu7.a;
import ok.h;
import java.util.ArrayList;
import ekd.j;
import com.yxcorp.gifshow.relation.explore.fragment.ContactsListFragment$b;
import qvb.f;
import xac.f;

public class ContactsListFragment extends SimpleUserListFragment	// class@0017fb
{
    public View F;
    public boolean G;
    public boolean H;
    public c I;
    public static final int J;

    public void ContactsListFragment(){
       super();
       this.G = false;
       this.H = false;
    }
    public t Bh(){
       a uoa;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, ContactsListFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0x7f0805df;
       ContactsListFragment tG = this.G;
       if (tG == null) {
          uoa = a.b;
       }
       uoa = new a(i, 0x7f100805, 0x7f100810, 0x7f105070, 0x7f100dbc, objArray);
       return new ContactsListFragment$c(this, this, obj, (tG ^ 0x01));
    }
    public a Gh(){
       a obj = PatchProxy.apply(null, this, ContactsListFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.Gh();
       obj.o(this.getActivity().getResources().getDrawable(R.drawable.arg_RES_7f08206c));
       return obj;
    }
    public String Hh(User p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, ContactsListFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "";
       }
       obj = new Object[]{p0.getId()};
       return String.format("0_%s_p210", obj);
    }
    public int M(){
       return 1;
    }
    public boolean S1(){
       return false;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ContactsListFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(ContactsListFragment.class, null);
       return objectsByTag;
    }
    public int getPage(){
       return 70;
    }
    public String getUrl(){
       Object obj = PatchProxy.apply(null, this, ContactsListFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getActivity() instanceof GifshowActivity) {
          return this.getActivity().getUrl();
       }
       return super.getUrl();
    }
    public boolean i0(){
       Object obj = PatchProxy.apply(null, this, ContactsListFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (super.i0() && (PermissionUtils.a(a.b(), "android.permission.READ_CONTACTS") && f.b()))? true: false;
       return b;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ContactsListFragment.class, "2")) {
          return;
       }
       super.onActivityCreated(p0);
       if (this.getActivity() instanceof ContactsListActivity) {
          this.I = this.getActivity().I;
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ContactsListFragment.class, "5")) {
          return;
       }
       super.onCreate(p0);
       this.G = this.getActivity().getIntent().getBooleanExtra("isShowContactsFirstGuide", false);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ContactsListFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = super.onCreateView(p0, p1, p2);
       if (this.F == null) {
          this.F = a.a(view.getContext(), 0x7f0d021b);
       }
       return view;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ContactsListFragment.class, "7")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.C.h(new ContactsListFragment$d(this));
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(ContactsListFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, ContactsListFragment.class, "10")) {
          return;
       }
       super.v2(p0, p1);
       if (p0) {
          if (!this.q().isEmpty() && !this.ia().U0(this.F)) {
             this.ia().P0(this.F);
          }else if(this.q().isEmpty() && this.ia().U0(this.F)){
             this.ia().m1(this.F);
          }
          this.H = true;
          if (this.getActivity() instanceof ContactsListActivity) {
             ContactsListActivity activity = this.getActivity();
             int count = this.q().getCount();
             Objects.requireNonNull(activity);
             if (!PatchProxy.isSupport(ContactsListActivity.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(count), activity, ContactsListActivity.class, "14")) {
                activity.x3();
                Intent intent = new Intent();
                intent.putExtra("contactsCount", count);
                activity.setResult(-1, intent);
             }
          }
          this.F.findViewById(R.id.title).setText(a1.r(R.string.arg_RES_7f100803, String.valueOf(this.q().getItems().size())));
       }
       return;
    }
    public g vh(){
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, ContactsListFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new c();
       if (this.G != null) {
          String pageParams = (this.getActivity() instanceof ContactsListActivity)? this.getActivity().getPageParams(): "";
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page = 54;
          if (!TextUtils.x(pageParams)) {
             urlPackage.params = pageParams;
          }
          obj.a = urlPackage;
       }
       Object[] objArray1 = new Object[]{new c("USER_CLICK_LOGGER", obj),new c("USER_FOLLOW_LOGGER", new ContactsListFragment$a(this)),new c("AUTO_ALIAS_CALLER_CONTEXT", new a(1, objArray))};
       return new ContactsListFragment$b(this, j.a(objArray1));
    }
    public i yh(){
       f uof = PatchProxy.apply(null, this, ContactsListFragment.class, "8");
       if (uof != PatchProxyResult.class) {
       }else {
          uof = new f();
       }
       return uof;
    }
}
