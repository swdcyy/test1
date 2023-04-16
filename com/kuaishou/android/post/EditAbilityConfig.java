package com.kuaishou.android.post.EditAbilityConfig;
import java.io.Serializable;
import com.kuaishou.android.post.EditAbilityConfig$a;
import java.lang.Object;
import com.kuaishou.android.post.PostArguments;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.post.SerialArg;
import com.kuaishou.android.post.PostPageArg;
import java.lang.Boolean;
import com.kuaishou.android.post.EditAbilityConfig$TextParam;
import java.lang.StringBuilder;

public class EditAbilityConfig implements Serializable	// class@000e9e
{
    public final String mActivityScenario;
    public final boolean mDisableBottomRecyclerView;
    public final boolean mEnableBackDialog;
    public final boolean mEnableDraft;
    public final String mEnableEditorCode;
    public final boolean mEnableFrameUpload;
    public final boolean mEnableNormalPublish;
    public final boolean mEnableNormalSplash;
    public final String mFragmentScenario;
    public final String mPage2Name;
    public final int mPhotosInMemory;
    public final EditAbilityConfig$TextParam mTextParam;
    public static final EditAbilityConfig DEFAULT;
    public static final long serialVersionUID;

    static {
       EditAbilityConfig.DEFAULT = new EditAbilityConfig(new EditAbilityConfig$a());
    }
    public void EditAbilityConfig(EditAbilityConfig$a p0){
       super();
       this.mEnableEditorCode = p0.a;
       this.mEnableNormalPublish = p0.b;
       this.mEnableBackDialog = p0.c;
       this.mEnableDraft = p0.d;
       this.mEnableFrameUpload = p0.e;
       this.mPhotosInMemory = p0.f;
       this.mFragmentScenario = p0.g;
       this.mActivityScenario = p0.h;
       this.mEnableNormalSplash = p0.i;
       this.mPage2Name = p0.j;
       this.mTextParam = p0.k;
       this.mDisableBottomRecyclerView = p0.l;
    }
    public static String activityScenario(PostArguments p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditAbilityConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getEditAbilityConfig().get(EditAbilityConfig.DEFAULT).mActivityScenario;
    }
    public static boolean disableBottomRecyclerView(PostArguments p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditAbilityConfig.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return p0.getEditAbilityConfig().get(EditAbilityConfig.DEFAULT).mDisableBottomRecyclerView;
    }
    public static boolean enableBackDialog(PostArguments p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditAbilityConfig.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return p0.getEditAbilityConfig().get(EditAbilityConfig.DEFAULT).mEnableBackDialog;
    }
    public static boolean enableDraft(PostArguments p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditAbilityConfig.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return p0.getEditAbilityConfig().get(EditAbilityConfig.DEFAULT).mEnableDraft;
    }
    public static String enableEditorCode(PostArguments p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditAbilityConfig.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getEditAbilityConfig().get(EditAbilityConfig.DEFAULT).mEnableEditorCode;
    }
    public static boolean enableFrameUpload(PostArguments p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditAbilityConfig.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return p0.getEditAbilityConfig().get(EditAbilityConfig.DEFAULT).mEnableFrameUpload;
    }
    public static boolean enableNormalPublish(PostArguments p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditAbilityConfig.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return p0.getEditAbilityConfig().get(EditAbilityConfig.DEFAULT).mEnableNormalPublish;
    }
    public static boolean enableNormalSplash(PostArguments p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditAbilityConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return p0.getEditAbilityConfig().get(EditAbilityConfig.DEFAULT).mEnableNormalSplash;
    }
    public static String fragmentScenario(PostArguments p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditAbilityConfig.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getEditAbilityConfig().get(EditAbilityConfig.DEFAULT).mFragmentScenario;
    }
    public static EditAbilityConfig$TextParam getTextParam(PostArguments p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditAbilityConfig.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getEditAbilityConfig().get(EditAbilityConfig.DEFAULT).mTextParam;
    }
    public static String page2Name(PostArguments p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditAbilityConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getEditAbilityConfig().get(EditAbilityConfig.DEFAULT).mPage2Name;
    }
    public static boolean photosInMemory(PostArguments p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditAbilityConfig.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.getEditAbilityConfig().get(EditAbilityConfig.DEFAULT).mPhotosInMemory != null)? true: false;
       return b;
    }
    public static boolean photosInMemoryBlock(PostArguments p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditAbilityConfig.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.getEditAbilityConfig().get(EditAbilityConfig.DEFAULT).mPhotosInMemory == 2)? true: false;
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, EditAbilityConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "EditAbilityConfig{mEnableEditorCode="+this.mEnableEditorCode+", mEnableNormalPublish="+this.mEnableNormalPublish+", mEnableBackDialog="+this.mEnableBackDialog+", mEnableDraft="+this.mEnableDraft+", mEnableFrameUpload="+this.mEnableFrameUpload+", mPhotosInMemory="+this.mPhotosInMemory+", mFragmentScenario=\'"+this.mFragmentScenario+'''+", mActivityScenario=\'"+this.mActivityScenario+'''+", mEnableNormalSplash="+this.mEnableNormalSplash+", mPage2Name=\'"+this.mPage2Name+'''+", mTextParam=\'"+this.mTextParam+'''+", mDisableBottomRecyclerView=\'"+this.mDisableBottomRecyclerView+'''+'}';
    }
}
