package z61.b;
import java.lang.Object;
import java.lang.Boolean;
import ok.x;
import com.google.common.base.Suppliers;
import z61.c;
import com.google.gson.JsonObject;

public abstract class b	// class@0049a2
{
    public a mClickCallback;
    public x mClickLogParamsSupplier;
    public boolean mEnableBreathAnimator;
    public int mFeatureId;
    public b mHiddenCallback;
    public boolean mIsRightAlign;
    public Boolean mIsVisible;
    public String mKwaiLink;
    public boolean mShouldReportLogWithBottomBar;
    public c mShowCallback;
    public x mShowLogParamsSupplier;
    public CharSequence mText;
    public float mTextAlpha;
    public int mTextRes;

    public void b(){
       super();
       this.mIsVisible = Boolean.TRUE;
       this.mFeatureId = -1;
       this.mText = "";
       this.mTextRes = -1;
       this.mTextAlpha = 0x3f800000;
       this.mClickCallback = null;
       this.mShowCallback = null;
       this.mIsRightAlign = false;
       this.mShouldReportLogWithBottomBar = true;
       this.mShowLogParamsSupplier = Suppliers.b(null);
       this.mClickLogParamsSupplier = Suppliers.b(null);
    }
    public abstract c getViewItemInstanceFactory();
    public void setClickLogParams(x p0){
       this.mClickLogParamsSupplier = p0;
    }
    public void setShowLogParams(x p0){
       this.mShowLogParamsSupplier = p0;
    }
    public abstract void update(JsonObject p0);
}
