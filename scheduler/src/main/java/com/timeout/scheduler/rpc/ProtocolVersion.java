package com.timeout.scheduler.rpc;

import org.apache.hadoop.ipc.VersionedProtocol;

/**
 * 所有使用RPC的接口都必须继承这个接口。并可以参考下面的代码实现其中的方法
 *
 * <pre>
 *   public long getProtocolVersion(String protocol, long clientVersion) throws IOException {
 *       if (protocol.equals(YourRPCInterface.class.getName())) {
 *           return ProtocolVersion.versionID;
 *         }
 *         throw new IOException("Unknown protocol to name node: " + protocol);
 *   }
 * </pre>
 */
public interface ProtocolVersion extends VersionedProtocol {

    public static final long versionID = 1L;
}
