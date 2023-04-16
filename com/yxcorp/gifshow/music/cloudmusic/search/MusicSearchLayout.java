package com.yxcorp.gifshow.music.cloudmusic.search.MusicSearchLayout;
import com.kwai.feature.component.searchhistory.SearchLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.feature.component.searchhistory.SearchHistoryData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.view.View;
import ekd.m1;
import lnc.a1;
import java.lang.Boolean;
import lob.q;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.music.cloudmusic.search.MusicSearchLayout$a;
import android.widget.EditText;
import android.widget.RelativeLayout;
import com.yxcorp.utility.n;
import android.widget.TextView;
import android.view.KeyEvent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class MusicSearchLayout extends SearchLayout	// class@00202f
{
    public String N;
    public int O;
    public View P;
    public MusicSearchLayout$a Q;

    public void MusicSearchLayout(Context p0){
       super(p0);
    }
    public void MusicSearchLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void MusicSearchLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void F6(SearchHistoryData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicSearchLayout.class, "8")) {
          return;
       }
       this.N = "history";
       this.O = -1;
       super.F6(p0);
       return;
    }
    public void a(String p0,String p1,int p2){
       if (PatchProxy.isSupport(MusicSearchLayout.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, MusicSearchLayout.class, "9")) {
          return;
       }
       this.N = "sugg";
       this.O = p2;
       super.a(p0, p1, p2);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicSearchLayout.class, "1")) {
          return;
       }
       super.doBindView(p0);
       p0 = m1.f(p0, R.id.clear_button);
       if (!PatchProxy.applyVoidOneRefs(p0, this, MusicSearchLayout.class, "2")) {
          int i = a1.e(5.00f);
          if (p0 != null) {
             p0.setPadding(i, i, i, i);
          }
       }
       return;
    }
    public String getEntrance(){
       return this.N;
    }
    public int getEntranceIndex(){
       return this.O;
    }
    public void j(boolean p0,String p1){
       if (PatchProxy.isSupport(MusicSearchLayout.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, MusicSearchLayout.class, "12")) {
          return;
       }
       if (q.f(this.getKeyword())) {
          return;
       }
       super.j(p0, p1);
       return;
    }
    public void n(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MusicSearchLayout.class, "5")) {
          return;
       }
       MusicSearchLayout obj = PatchProxy.apply(objArray, this, MusicSearchLayout.class, "6");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = this.Q;
          b = (obj != null)? obj.a(): false;
       }
       if (b) {
          return;
       }else {
          super.n();
          return;
       }
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, MusicSearchLayout.class, "4")) {
          return;
       }
       super.o();
       MusicSearchLayout tQ = this.Q;
       if (tQ != null) {
          tQ.c();
       }
       SearchLayout te = this.e;
       if (te != null) {
          te.requestFocus();
          n.a0(this.getContext(), this.e, 250);
       }
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, MusicSearchLayout.class, "7")) {
          return;
       }
       super.onFinishInflate();
       this.P = this.findViewById(0x7f0a1407);
       return;
    }
    public boolean p(TextView p0,int p1,KeyEvent p2){
       if (PatchProxy.isSupport(MusicSearchLayout.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, MusicSearchLayout.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (3 == p1) {
          this.N = "search";
          this.O = -1;
       }
       return super.p(p0, p1, p2);
    }
    public void q(View p0,boolean p1){
       if (PatchProxy.isSupport(MusicSearchLayout.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, MusicSearchLayout.class, "3")) {
          return;
       }
       MusicSearchLayout tQ = this.Q;
       if (tQ != null) {
          tQ.b();
       }
       super.q(p0, p1);
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, MusicSearchLayout.class, "10")) {
          return;
       }
       this.N = "search";
       this.O = -1;
       super.r();
       return;
    }
    public void setSearchLayoutListener(MusicSearchLayout$a p0){
       this.Q = p0;
    }
    public void setSearchTipWrapperBackgroundColor(int p0){
       if (PatchProxy.isSupport(MusicSearchLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, MusicSearchLayout.class, "14")) {
          return;
       }
       SearchLayout tj = this.j;
       if (tj != null) {
          tj.setBackgroundColor(p0);
       }
       return;
    }
    public void y(boolean p0){
       if (PatchProxy.isSupport(MusicSearchLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MusicSearchLayout.class, "13")) {
          return;
       }
       MusicSearchLayout tP = this.P;
       if (tP != null) {
          Resources resources = this.getResources();
          int i = (p0)? 0x7f0818e9: 0x7f0818e8;
          tP.setBackground(resources.getDrawable(i));
       }
       return;
    }
}
