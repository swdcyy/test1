package com.kwai.yoda.model.ButtonParams;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.yoda.model.ButtonParams$PositionId;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.yoda.Yoda;
import com.kwai.yoda.YodaInitConfig;
import java.util.Objects;

public class ButtonParams implements Serializable	// class@0012bd
{
    public ButtonParams$PositionId mButtonId;
    public String mImage;
    public String mPageAction;
    public String mPressedImage;
    public boolean mRedDot;
    public String mRole;
    public String mText;
    public String mTextColor;
    public String mTitle;
    public String mViewType;
    public static final long serialVersionUID = 0x50cfde18c184d060;

    public void ButtonParams(){
       super();
       this.mTextColor = "default";
       this.mImage = "back";
       this.mPressedImage = "back";
       this.mButtonId = ButtonParams$PositionId.LEFT1;
    }
    public static int getButtonDrawable(String p0,int p1){
       int customButton;
       if (PatchProxy.isSupport(ButtonParams.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, ButtonParams.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (Yoda.get().getConfig() == null) {
          return p1;
       }else {
          Objects.requireNonNull(p0);
          int i = -1;
          switch (p0.hashCode()){
              case 0xaf968b71:
                if (p0.equals("custom")) {
                   i = 0;
                }
                break;
              case 0x2e04e7:
                if (p0.equals("back")) {
                   i = 1;
                }
                break;
              case 0x5a5ddf8:
                if (p0.equals("close")) {
                   i = 2;
                }
                break;
              case 0x6854fdf:
                if (p0.equals("share")) {
                   i = 3;
                }
                break;
              default:
          }
          switch (i){
              case 0:
                customButton = Yoda.get().getConfig().getCustomButtonDrawable();
                if (customButton) {
                   p1 = customButton;
                }
                break;
              case 1:
                customButton = Yoda.get().getConfig().getBackButtonDrawable();
                if (customButton) {
                   p1 = customButton;
                }
                return p1;
                break;
              case 2:
                customButton = Yoda.get().getConfig().getCloseButtonDrawable();
                if (customButton) {
                   p1 = customButton;
                }
                return p1;
                break;
              case 3:
                customButton = Yoda.get().getConfig().getShareButtonDrawable();
                if (customButton) {
                   p1 = customButton;
                }
                return p1;
                break;
              default:
                return p1;
          }
          return p1;
       }
    }
}
