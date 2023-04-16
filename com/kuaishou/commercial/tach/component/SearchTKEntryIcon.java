package com.kuaishou.commercial.tach.component.SearchTKEntryIcon;
import com.tachikoma.core.component.e;
import gx4.f;
import android.content.Context;
import android.view.View;
import com.kwai.feature.component.entry.view.SearchIconEntryView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.kuaishou.commercial.tach.component.SearchTKEntryIcon$b;
import com.google.gson.Gson;
import java.lang.Exception;
import yx.j0;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.content.res.Resources;
import android.graphics.Color;
import android.widget.ImageView;
import java.lang.Integer;
import com.kuaishou.commercial.tach.component.SearchTKEntryIcon$a;
import oy5.b;

public class SearchTKEntryIcon extends e	// class@001650
{
    public String mEntrySource;
    public SearchTKEntryIcon$b v;

    public void SearchTKEntryIcon(f p0){
       super(p0);
    }
    public void configClickLogData(){
    }
    public View createViewInstance(Context p0){
       return this.createViewInstance(p0);
    }
    public SearchIconEntryView createViewInstance(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchTKEntryIcon.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SearchIconEntryView(p0);
    }
    public void searchEntryDidShow(){
       if (PatchProxy.applyVoid(null, this, SearchTKEntryIcon.class, "4")) {
          return;
       }
       this.getView().s0();
       return;
    }
    public void searchEntryUpdateAppearance(String p0){
       SearchTKEntryIcon$b a;
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchTKEntryIcon.class, "3")) {
          return;
       }
       int i = 0;
       try{
          this.v = a.a.h(p0, SearchTKEntryIcon$b.class);
       }catch(java.lang.Exception e6){
          Object[] objArray = new Object[i];
          j0.f("SearchTKEntryIcon", e6.getMessage(), objArray);
       }
       SearchTKEntryIcon tv = this.v;
       if (tv == null) {
          return;
       }
       SearchTKEntryIcon$b b = tv.b;
       a = tv.a;
       SearchTKEntryIcon$b c = tv.c;
       Context context = this.getContext();
       if (!TextUtils.x(a)) {
          this.getView().A(Uri.parse(a), i, i);
       }else if(!TextUtils.x(b)){
          this.getView().setResource(context.getResources().getIdentifier(b, "drawable", context.getPackageName()));
       }
       if (!TextUtils.x(c)) {
          this.getView().setColorFilter(Color.parseColor(c));
       }
       return;
    }
    public void setupSearchEntryView(int p0,String p1,String p2){
       if (PatchProxy.isSupport(SearchTKEntryIcon.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, SearchTKEntryIcon.class, "2")) {
          return;
       }
       this.mEntrySource = p1;
       this.getView().setSearchActionCallback(new SearchTKEntryIcon$a(this));
       this.searchEntryUpdateAppearance(p2);
       return;
    }
}
