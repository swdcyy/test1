package com.kwai.video.waynelive.datasource.LiveDataSourceResolver;
import com.kwai.video.waynelive.datasource.LiveDnsResolver;
import com.kwai.video.waynelive.datasource.LiveRavenParam;

public interface abstract LiveDataSourceResolver implements LiveDnsResolver	// class@000de8
{

    boolean interceptResolveUrl(LiveRavenParam p0);
}
