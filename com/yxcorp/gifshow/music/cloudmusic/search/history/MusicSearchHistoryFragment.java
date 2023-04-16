package com.yxcorp.gifshow.music.cloudmusic.search.history.MusicSearchHistoryFragment;
import com.kwai.feature.component.searchhistory.SearchHistoryFragment;
import z8c.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption;
import com.yxcorp.gifshow.music.cloudmusic.search.history.a;
import z8c.a$a;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption$b;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import java.util.Map;
import java.lang.StringBuilder;
import kqb.d0;
import androidx.fragment.app.Fragment;
import y8c.g;
import epb.a;
import g06.e;
import com.kwai.feature.component.searchhistory.d;

public class MusicSearchHistoryFragment extends SearchHistoryFragment	// class@002036
{
    public String K;
    public MusicSearchUiOption L;
    public static final int M;

    public void MusicSearchHistoryFragment(){
       super();
    }
    public a Gh(){
       boolean b;
       MusicSearchHistoryFragment tL;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, MusicSearchHistoryFragment.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(objArray, this, MusicSearchHistoryFragment.class, "8");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          tL = this.L;
          b = (tL == null || tL.getMusicSearchSource() != 1)? true: false;
       }
       obj = new a(1, false, b);
       obj.l(1, a.a);
       obj.l(2, a.a);
       obj.l(10, a.a);
       tL = this.L;
       if (tL != null && MusicSearchUiOption.Companion.a(tL.getDividerColorId())) {
          obj.h().setTint(a1.a(this.L.getDividerColorId()));
       }
       return obj;
    }
    public boolean N5(){
       boolean b;
       MusicSearchHistoryFragment obj = PatchProxy.apply(null, this, MusicSearchHistoryFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.L;
       if (obj != null) {
          b = (!obj.getForbidSubFragmentLogPage())? true: false;
       }else {
          b = super.N5();
       }
       return b;
    }
    public boolean Xg(){
       boolean b;
       MusicSearchHistoryFragment obj = PatchProxy.apply(null, this, MusicSearchHistoryFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.L;
       if (obj != null) {
          b = (!obj.getForbidSubFragmentLogPage())? true: false;
       }else {
          b = super.Xg();
       }
       return b;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MusicSearchHistoryFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       MusicSearchHistoryFragment tL = this.L;
       tL = (tL != null && tL.isDarkMode())? 1: 0;
       int i = (tL)? 2: 0;
       return a.h(p0, 0x7f0d00f4, p1, false, i);
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MusicSearchHistoryFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(MusicSearchHistoryFragment.class, null);
       return objectsByTag;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, MusicSearchHistoryFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "task_id="+this.K;
    }
    public boolean i0(){
       Object obj = PatchProxy.apply(null, this, MusicSearchHistoryFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!d0.b()) {
          return true;
       }
       return super.i0();
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MusicSearchHistoryFragment.class, "1")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (this.getArguments() != null) {
          this.K = this.getArguments().getString("photo_task_id");
       }
       MusicSearchHistoryFragment tL = this.L;
       if (PatchProxy.applyVoidTwoRefs(p0, tL, this, MusicSearchHistoryFragment.class, "7") || (tL != null && MusicSearchUiOption.Companion.a(tL.getMainColorId()))) {
          p0.setBackgroundColor(a1.a(tL.getMainColorId()));
       }
    label_0047 :
       return;
    }
    public g vh(){
       a obj = PatchProxy.apply(null, this, MusicSearchHistoryFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a(this.G);
       obj.F = this.L;
       obj.w1(this.F);
       return obj;
    }
}
