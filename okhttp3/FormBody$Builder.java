package okhttp3.FormBody$Builder;
import java.nio.charset.Charset;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.util.Objects;
import okhttp3.HttpUrl;
import java.util.List;
import okhttp3.FormBody;

public final class FormBody$Builder	// class@002077
{
    public final Charset charset;
    public final List names;
    public final List values;

    public void FormBody$Builder(){
       super(null);
    }
    public void FormBody$Builder(Charset p0){
       super();
       this.names = new ArrayList();
       this.values = new ArrayList();
       this.charset = p0;
    }
    public FormBody$Builder add(String p0,String p1){
       Objects.requireNonNull(p0, "name == null");
       Objects.requireNonNull(p1, "value == null");
       this.names.add(HttpUrl.canonicalize(p0, " \"\':;<=>@[]^`{}|/\\?#&!$\(\),~", false, false, true, true, this.charset));
       this.values.add(HttpUrl.canonicalize(p1, " \"\':;<=>@[]^`{}|/\\?#&!$\(\),~", false, false, true, true, this.charset));
       return this;
    }
    public FormBody$Builder addEncoded(String p0,String p1){
       Objects.requireNonNull(p0, "name == null");
       Objects.requireNonNull(p1, "value == null");
       this.names.add(HttpUrl.canonicalize(p0, " \"\':;<=>@[]^`{}|/\\?#&!$\(\),~", true, false, true, true, this.charset));
       this.values.add(HttpUrl.canonicalize(p1, " \"\':;<=>@[]^`{}|/\\?#&!$\(\),~", true, false, true, true, this.charset));
       return this;
    }
    public FormBody build(){
       return new FormBody(this.names, this.values);
    }
}
