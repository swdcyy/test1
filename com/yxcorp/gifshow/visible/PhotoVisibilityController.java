package com.yxcorp.gifshow.visible.PhotoVisibilityController;
import ml8.d;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Object;
import android.view.View;
import android.app.Activity;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.yxcorp.gifshow.visible.ShareVisibleViewModel;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import com.kwai.feature.post.api.feature.story.model.PhotoVisibility;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import f66.i;
import jq.a;
import q87.c;
import com.yxcorp.gifshow.visible.ShareVisibleViewModel$b;
import android.widget.RadioButton;
import java.lang.CharSequence;
import ekd.m1;
import com.yxcorp.gifshow.activity.share.widget.InterceptRadioButton;
import com.kwai.library.widget.button.KwaiRadioGroup;
import com.yxcorp.gifshow.visible.PhotoVisibilityController$a;
import android.view.View$OnClickListener;
import androidx.lifecycle.MutableLiveData;
import rxc.d;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.visible.a;

public class PhotoVisibilityController implements d, LifecycleObserver	// class@0016b3
{
    public TextView b;
    public KwaiRadioGroup c;
    public InterceptRadioButton d;
    public RadioButton e;
    public RadioButton f;
    public ShareVisibleViewModel$b g;
    public PhotoVisibilityController$c h;
    public List i;
    public GifshowActivity j;
    public final ShareVisibleViewModel k;
    public c l;

    public void PhotoVisibilityController(GifshowActivity p0,c p1){
       super();
       this.j = p0;
       this.l = p1;
       this.b = p0.findViewById(0x7f0a3323);
       this.k = ViewModelProviders.of(p0).get(ShareVisibleViewModel.class);
    }
    public PhotoVisibility a(){
       PhotoVisibilityController obj = PatchProxy.apply(null, this, PhotoVisibilityController.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g;
       if (obj != null) {
          return obj.b();
       }
       Object[] objArray = new Object[0];
       a.b().A("PhotoVisibilityController", "getPhotoVisibility: mPhotoVisibilityInfo is null", objArray);
       return PhotoVisibility.PUBLIC;
    }
    public final void b(RadioButton p0,PhotoVisibility p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhotoVisibilityController.class, "5")) {
          return;
       }
       p0.setTag(R.id.radio_button, p1);
       p0.setText(p1.mName);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoVisibilityController.class, "1")) {
          return;
       }
       this.f = m1.f(p0, 0x7f0a365f);
       this.d = m1.f(p0, 0x7f0a2b66);
       this.c = m1.f(p0, 0x7f0a2f75);
       this.e = m1.f(p0, 0x7f0a172e);
       TextView textView = m1.f(p0, R.id.publish_type_v2);
       this.b = textView;
       textView.setOnClickListener(new PhotoVisibilityController$a(this));
       this.k.r0().observe(this.j, new d(this));
       this.k.s0().observe(this.j, new a(this));
       return;
    }
}
