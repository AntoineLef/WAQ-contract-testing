package com.antoineleuf.telephony.ws.domain;

import java.util.List;

public interface CallLogRepository {
  List<CallLog> findAll();

  void save(CallLog callLog);

  void remove(String id);
}
