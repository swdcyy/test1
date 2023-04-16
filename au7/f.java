package au7.f;
import au7.g;
import java.lang.Object;
import com.kwai.stentor.voicechange.VCResultType;
import com.kwai.stentor.voicechange.VCResultCode;
import au7.b;
import java.lang.String;

public class f implements g	// class@000378
{
    public byte[] a;
    public VCResultType b;
    public VCResultCode c;
    public int d;
    public String e;

    public void f(){
       super();
       byte[] uobyteArray = new byte[0];
       this.a = uobyteArray;
       this.b = VCResultType.VCResultTypeSegment;
       this.c = VCResultCode.VCResultCodeContinue;
       this.d = b.b;
       this.e = "";
    }
    public int a(){
       return this.d;
    }
    public String b(){
       return this.e;
    }
    public VCResultType c(){
       return this.b;
    }
    public VCResultCode d(){
       return this.c;
    }
    public byte[] getData(){
       return this.a;
    }
}
