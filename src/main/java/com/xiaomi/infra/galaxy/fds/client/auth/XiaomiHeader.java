package com.xiaomi.infra.galaxy.fds.client.auth;


public enum XiaomiHeader {

  DATE(Common.XIAOMI_HEADER_PREFIX + "date"),
  REQUEST_ID(Common.XIAOMI_HEADER_PREFIX + "request-id"),
  ACL(Common.XIAOMI_HEADER_PREFIX + "acl"),
  CONTENT_LENGTH(Common.XIAOMI_META_HEADER_PREFIX + "content-length"),
  MD5_ATTACHED_STREAM(Common.XIAOMI_META_HEADER_PREFIX + "md5-attached-stream");
  // TODO(wuzesheng) Add other xiaomi defined headers

  private final String name;

  private XiaomiHeader(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}
