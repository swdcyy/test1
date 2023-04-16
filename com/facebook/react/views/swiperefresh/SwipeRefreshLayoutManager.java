package com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager;
import jf.k;
import com.facebook.react.uimanager.ViewGroupManager;
import jf.j;
import ze.b;
import ze.n0;
import android.view.View;
import com.facebook.react.views.swiperefresh.ReactSwipeRefreshLayout;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.views.swiperefresh.SwipeRefreshLayoutManager$a;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$j;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.ReactContext;
import ze.c1;
import java.util.Map;
import vd.d$b;
import vd.d;
import java.lang.Integer;
import com.facebook.react.bridge.ReadableArray;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.Float;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public class SwipeRefreshLayoutManager extends ViewGroupManager implements k	// class@0013fb
{
    public final c1 mDelegate;

    public void SwipeRefreshLayoutManager(){
       super();
       this.mDelegate = new j(this);
    }
    public void addEventEmitters(n0 p0,View p1){
       this.addEventEmitters(p0, p1);
    }
    public void addEventEmitters(n0 p0,ReactSwipeRefreshLayout p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SwipeRefreshLayoutManager.class, "9")) {
          return;
       }
       p1.setOnRefreshListener(new SwipeRefreshLayoutManager$a(this, p0, p1));
       return;
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ReactSwipeRefreshLayout createViewInstance(n0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SwipeRefreshLayoutManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ReactSwipeRefreshLayout(p0);
    }
    public c1 getDelegate(){
       return this.mDelegate;
    }
    public Map getExportedCustomDirectEventTypeConstants(){
       d$b obj = PatchProxy.apply(null, this, SwipeRefreshLayoutManager.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a();
       obj.b("topRefresh", d.d("registrationName", "onRefresh"));
       return obj.a();
    }
    public Map getExportedViewConstants(){
       Object obj = PatchProxy.apply(null, this, SwipeRefreshLayoutManager.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.d("SIZE", d.e("DEFAULT", Integer.valueOf(1), "LARGE", Integer.valueOf(0)));
    }
    public String getName(){
       return "AndroidSwipeRefreshLayout";
    }
    public void receiveCommand(View p0,String p1,ReadableArray p2){
       this.receiveCommand(p0, p1, p2);
    }
    public void receiveCommand(ReactSwipeRefreshLayout p0,String p1,ReadableArray p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, SwipeRefreshLayoutManager.class, "10")) {
          return;
       }
       Objects.requireNonNull(p1);
       if (p1.equals("setNativeRefreshing") && p2 != null) {
          this.setRefreshing(p0, p2.getBoolean(0));
       }
       return;
    }
    public void setColors(View p0,ReadableArray p1){
       this.setColors(p0, p1);
    }
    public void setColors(ReactSwipeRefreshLayout p0,ReadableArray p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SwipeRefreshLayoutManager.class, "3")) {
          return;
       }
       int i = 0;
       if (p1 != null) {
          int[] ointArray = new int[p1.size()];
          for (; i < p1.size(); i = i + 1) {
             ointArray[i] = p1.getInt(i);
          }
          p0.setColorSchemeColors(ointArray);
       }else {
          int[] ointArray1 = new int[i];
          p0.setColorSchemeColors(ointArray1);
       }
       return;
    }
    public void setEnabled(View p0,boolean p1){
       this.setEnabled(p0, p1);
    }
    public void setEnabled(ReactSwipeRefreshLayout p0,boolean p1){
       SwipeRefreshLayoutManager swipeRefresh = SwipeRefreshLayoutManager.class;
       if (PatchProxy.isSupport(swipeRefresh) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, swipeRefresh, "2")) {
          return;
       }
       p0.setEnabled(p1);
       return;
    }
    public void setNativeRefreshing(View p0,boolean p1){
       this.setNativeRefreshing(p0, p1);
    }
    public void setNativeRefreshing(ReactSwipeRefreshLayout p0,boolean p1){
    }
    public void setProgressBackgroundColor(View p0,Integer p1){
       this.setProgressBackgroundColor(p0, p1);
    }
    public void setProgressBackgroundColor(ReactSwipeRefreshLayout p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SwipeRefreshLayoutManager.class, "4")) {
          return;
       }
       int i = (p1 == null)? 0: p1.intValue();
       p0.setProgressBackgroundColorSchemeColor(i);
       return;
    }
    public void setProgressViewOffset(View p0,float p1){
       this.setProgressViewOffset(p0, p1);
    }
    public void setProgressViewOffset(ReactSwipeRefreshLayout p0,float p1){
       SwipeRefreshLayoutManager swipeRefresh = SwipeRefreshLayoutManager.class;
       if (PatchProxy.isSupport(swipeRefresh) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, swipeRefresh, "8")) {
          return;
       }
       p0.setProgressViewOffset(p1);
       return;
    }
    public void setRefreshing(View p0,boolean p1){
       this.setRefreshing(p0, p1);
    }
    public void setRefreshing(ReactSwipeRefreshLayout p0,boolean p1){
       SwipeRefreshLayoutManager swipeRefresh = SwipeRefreshLayoutManager.class;
       if (PatchProxy.isSupport(swipeRefresh) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, swipeRefresh, "7")) {
          return;
       }
       p0.setRefreshing(p1);
       return;
    }
    public void setSize(View p0,int p1){
       this.setSize(p0, p1);
    }
    public void setSize(ReactSwipeRefreshLayout p0,int p1){
       SwipeRefreshLayoutManager swipeRefresh = SwipeRefreshLayoutManager.class;
       if (PatchProxy.isSupport(swipeRefresh) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, swipeRefresh, "5")) {
          return;
       }
       p0.setSize(p1);
       return;
    }
    public void setSize(ReactSwipeRefreshLayout p0,Dynamic p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SwipeRefreshLayoutManager.class, "6")) {
          return;
       }
       int i = 1;
       if (p1.isNull()) {
          p0.setSize(i);
       }else if(p1.getType() == ReadableType.Number){
          p0.setSize(p1.asInt());
       }else if(p1.getType() == ReadableType.String){
          String str = p1.asString();
          if (str.equals("default")) {
             p0.setSize(i);
          }else if(str.equals("large")){
             p0.setSize(0);
          }else {
             throw new IllegalArgumentException("Size must be \'default\' or \'large\', received: "+str);
          }
       }else {
          throw new IllegalArgumentException("Size must be \'default\' or \'large\'");
       }
       return;
    }
}
