package test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.InvalidProtocolBufferException;
import com.kedong.platform.imdg.core.IMap;

import app.model.data.ServerData;
import app.model.table.process.ModelTableProtoEntryProcess;
import client.PlatfromClient;
import cn.sg.common.ImdgLogger;
import message.ServiceGridModel.GridModelResponse;
import message.ServiceGridModel.RTKEY;
import message.ServiceModelMeas.ModelMeasResponse;

public class TestMain1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException, InvalidProtocolBufferException {
//		System.out.println("hello");
		// TODO 自动生成的方法存根
		PlatfromClient client = new PlatfromClient("99.99.99.6");
		
		ServerData data = new ServerData();
		data.setContext_name("realtime");
		data.setApp_name("grid_mirroring_model");
		data.setModel_name("sg");
		data.setTable_name("GridModelLoad");
		
//		System.out.println(data.getContext_name()); // 打印
//		System.out.println(data.getApp_name()); // 打印
//		System.out.println(data.getModel_name()); // 打印
//		System.out.println(data.getTable_name()); // 打印
		
		Object object = client.getMap(GridModelResponse.class).submitToKey(data.getKey(), new ModelTableProtoEntryProcess(data.getTable_name())).get();
		
		GridModelResponse response = GridModelResponse.parseFrom((byte[])object) ;
		
		if (response.getSerializedSize() == 0) {
			System.out.println("model is not existed" );
			System.out.println("size:"+response.getSerializedSize());
		}

		else {	
//		for(Object obj:response.getUnitinfoList()) {
////			System.out.println(obj);
//		       }
//		System.out.println("size:"+response.getUnitinfoList().size());
		
		for(Object obj2:response.getLoadinfoList()) {
			System.out.println(obj2);
		       }
		System.out.println("size:"+response.getLoadinfoList().size());
	
		
		}
//		response.getLoadinfoList().forEach(end->{
//			System.out.println(end.getId());
//		});
	}
	
}
//	private static void cacheData(Set<Long> keySet, GridModelResponse response) {
//		cacheData(keySet, response.getAclnendinfoList());
//		cacheData(keySet, response.getBreakinfoList());
//		cacheData(keySet, response.getDisinfoList());
//		cacheData(keySet, response.getCpinfoList());
//		cacheData(keySet, response.getCvtinfoList());
//		cacheData(keySet, response.getDcdisinfoList());
//		cacheData(keySet, response.getDclineendinfoList());
//		cacheData(keySet, response.getDisbrkinfoList());
//		cacheData(keySet, response.getElcbusinfoList());
//		cacheData(keySet, response.getLoadinfoList());
//		cacheData(keySet, response.getScpinfoList());
//		cacheData(keySet, response.getUnitinfoList());
//		cacheData(keySet, response.getXfwdinfoList());
//		
//	}
//
//
//	private static void cacheData(Set<Long> keySet, List<? extends GeneratedMessage> infoList) {
//		infoList.forEach(obj -> {
//			RTKEY id = (RTKEY) obj.getAllFields().entrySet().stream().findFirst().get().getValue();
//			keySet.add(id.getId1() + id.getId2());
//		});
//	}
//}

//		System.exit(0);
	


