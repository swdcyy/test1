package a4b.a$a;
import a4b.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class a$a	// class@000042
{
    public final a a;
    public String mContent;
    public JsonObject mExt;
    public String mIdentifier;
    public int mMaxTextCount;
    public int mMinTextCount;
    public String mName;
    public String mPlaceHolder;
    public String mSelectDateTitle;
    public String mType;
    public boolean mUserInput;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public String a(){
       return this.mContent;
    }
    public String b(){
       return this.mIdentifier;
    }
    public String c(){
       return this.mName;
    }
    public String d(){
       return this.mType;
    }
    public boolean e(){
       return this.mUserInput;
    }
    public void f(String p0){
       this.mContent = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Element{mIdentifier=\'"+this.mIdentifier+'''+", mName=\'"+this.mName+'''+", mType=\'"+this.mType+'''+", mPlaceHolder=\'"+this.mPlaceHolder+'''+", mMinTextCount="+this.mMinTextCount+", mMaxTextCount="+this.mMaxTextCount+", mUserInput="+this.mUserInput+", mContent=\'"+this.mContent+'''+", mExt="+this.mExt+", mSelectDateTitle=\'"+this.mSelectDateTitle+'''+'}';
    }
}
