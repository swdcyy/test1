package okhttp3.Route;
import okhttp3.Address;
import java.net.Proxy;
import java.net.InetSocketAddress;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.net.Proxy$Type;
import java.lang.StringBuilder;

public final class Route	// class@002097
{
    public final Address address;
    public final InetSocketAddress inetSocketAddress;
    public final Proxy proxy;

    public void Route(Address p0,Proxy p1,InetSocketAddress p2){
       super();
       Objects.requireNonNull(p0, "address == null");
       Objects.requireNonNull(p1, "proxy == null");
       Objects.requireNonNull(p2, "inetSocketAddress == null");
       this.address = p0;
       this.proxy = p1;
       this.inetSocketAddress = p2;
    }
    public Address address(){
       return this.address;
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof Route && (p0.address.equals(this.address) && (p0.proxy.equals(this.proxy) && p0.inetSocketAddress.equals(this.inetSocketAddress))))? true: false;
       return b;
    }
    public int hashCode(){
       return (((((527 + this.address.hashCode()) * 31) + this.proxy.hashCode()) * 31) + this.inetSocketAddress.hashCode());
    }
    public Proxy proxy(){
       return this.proxy;
    }
    public boolean requiresTunnel(){
       boolean b = (this.address.sslSocketFactory != null && this.proxy.type() == Proxy$Type.HTTP)? true: false;
       return b;
    }
    public InetSocketAddress socketAddress(){
       return this.inetSocketAddress;
    }
    public String toString(){
       return "Route{"+this.inetSocketAddress+"}";
    }
}
