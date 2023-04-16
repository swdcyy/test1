package com.yxcorp.gifshow.model.response.CityRoamingSearchPresetWordsResponse$PresetWord;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class CityRoamingSearchPresetWordsResponse$PresetWord implements Serializable	// class@001f23
{
    public String mId;
    public boolean mIsTopPresetWord;
    public String mSearchWord;
    public String mShowName;
    public static final long serialVersionUID = 0x3da0df0d174c46a5;

    public void CityRoamingSearchPresetWordsResponse$PresetWord(){
       super();
    }
    public static boolean isPresetWordSame(CityRoamingSearchPresetWordsResponse$PresetWord p0,CityRoamingSearchPresetWordsResponse$PresetWord p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, CityRoamingSearchPresetWordsResponse$PresetWord.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null && p1 != null) {
          if (TextUtils.n(p0.mId, p1.mId)) {
             return true;
          }else if(TextUtils.n(p0.mShowName, p1.mShowName) && TextUtils.n(p0.mSearchWord, p1.mSearchWord)){
             b = true;
          }
       }
       return b;
    }
    public static boolean isValidPresetWord(CityRoamingSearchPresetWordsResponse$PresetWord p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CityRoamingSearchPresetWordsResponse$PresetWord.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (!TextUtils.x(p0.mSearchWord) && (!TextUtils.x(p0.mShowName) && !TextUtils.x(p0.mId))))? true: false;
       return b;
    }
}
