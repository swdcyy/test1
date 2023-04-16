package com.yxcorp.gifshow.comment.emotion.detail.EmotionDetailFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import lk9.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import com.kwai.emotionsdk.bean.EmotionInfo;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import android.os.Parcelable;
import org.parceler.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.comment.emotion.detail.e;

public class EmotionDetailFragment extends BaseFragment	// class@0010c1
{
    public PresenterV2 j;
    public final a k;

    public void EmotionDetailFragment(){
       super();
       this.k = new a();
    }
    public int M(){
       return 4;
    }
    public String getPageParams(){
       a obj = PatchProxy.apply(null, this, EmotionDetailFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k.b;
       try{
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("emo_id", obj.mId);
          jSONObject.put("emotion_biz_type", obj.mBizType);
          return jSONObject.toString();
       }catch(org.json.JSONException e0){
          return "";
       }
    }
    public String o(){
       return "LARGE_EMOTION";
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EmotionDetailFragment.class, "3")) {
          return;
       }
       super.onActivityCreated(p0);
       p0 = this.getArguments();
       if (p0 == null) {
          this.getActivity().finish();
          return;
       }else {
          this.k.b = b.a(p0.getParcelable("emotion_info"));
          String str = "";
          this.k.d = p0.getString("comment_id", str);
          this.k.c = p0.getString("photo_id", str);
          EmotionDetailFragment tj = this.j;
          if (tj != null) {
             Object[] objArray = new Object[]{this.k};
             tj.i(objArray);
          }
          return;
       }
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, EmotionDetailFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d03cd, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, EmotionDetailFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       EmotionDetailFragment tj = this.j;
       if (tj != null) {
          tj.destroy();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EmotionDetailFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       e uoe = new e();
       this.j = uoe;
       uoe.f(p0);
       return;
    }
}
