package com.kuaishou.android.model.mix.CoverCommonTagLabelModel;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;

public class CoverCommonTagLabelModel implements Serializable, a	// class@000c34
{
    public CDNUrl[] bgImage;
    public CoverCommonTagLabelModel$LabelModeStyle darkModeStyle;
    public boolean disableTag;
    public Map extParams;
    public CDNUrl[] leftIcon;
    public String linkUrl;
    public int mCustomIconType;
    public boolean mEnableTextShadow;
    public String mExtraText;
    public CoverCommonTagLabelModel$FootExtraText mFootExtraText;
    public List mHeadUrlModels;
    public boolean mIsDot;
    public boolean mIsLabelShowing;
    public boolean mIsTextLight;
    public CoverCommonTagLabelModel$LeftIconWh mLeftIconWh;
    public CoverCommonTagLabelModel$RightSideExtraText mRightSideExtraText;
    public RichTextMeta mTextV2;
    public String photoSource;
    public int tagType;
    public String text;
    public Integer textColor;
    public String textColorStr;
    public static final long serialVersionUID = 0x88eb8f042ae36a3d;

    public void CoverCommonTagLabelModel(){
       super();
       this.mIsDot = false;
    }
    public static Integer parseTextColor(String p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, CoverCommonTagLabelModel.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (TextUtils.x(p0)) {
          return obj;
       }
       if (p0.startsWith("#")) {
          return Integer.valueOf(TextUtils.J(p0, 0));
       }
       return Integer.valueOf(TextUtils.J("#"+p0, 0));
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, CoverCommonTagLabelModel.class, "1")) {
          return;
       }
       this.textColor = CoverCommonTagLabelModel.parseTextColor(this.textColorStr);
       return;
    }
}
