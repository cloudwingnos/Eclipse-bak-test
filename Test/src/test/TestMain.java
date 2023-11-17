package test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.InvalidProtocolBufferException;
import com.kedong.platform.imdg.core.IMap;

import app.model.copy.process.GetEntryProcess;
import app.model.data.ServerData;
import app.model.table.process.ModelTableProtoEntryProcess;
import app.start.topo.ModelChangeClient;
import client.PlatfromClient;
import cn.sg.common.ImdgLogger;
import message.ServiceGridModel.GridModelAclineend;
import message.ServiceGridModel.GridModelArea;
import message.ServiceGridModel.GridModelBreaker;
import message.ServiceGridModel.GridModelCp;
import message.ServiceGridModel.GridModelDis;
import message.ServiceGridModel.GridModelElcBus;
import message.ServiceGridModel.GridModelGrdDis;
import message.ServiceGridModel.GridModelLoad;
import message.ServiceGridModel.GridModelResponse;
import message.ServiceGridModel.GridModelSubstation;
import message.ServiceGridModel.GridModelUnit;
import message.ServiceGridModel.RTKEY;
import message.ServiceModelMeas.ModelMeasResponse;

public class TestMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException, InvalidProtocolBufferException {
//		System.out.println("hello");
		// TODO 自动生成的方法存根
		PlatfromClient client = new PlatfromClient("99.99.99.6");
//		 ModelChangeClient client ;
//		client.ModelChangeClient("99.99.99.6");
		String key = "realtimegrid_mirroring_modelNW_PModel_1";
		
		
		Object object = client.getMap(GridModelResponse.class)
				.submitToKey(key, new GetEntryProcess()).get();
		
		GridModelResponse response = GridModelResponse.parseFrom((byte[])object) ;
		
		if (response.getSerializedSize() == 0) {
			System.out.println("model is not existed" );
			System.out.println("size:"+response.getSerializedSize());
		}

		else {	
/*	for循环遍历方式 
  	for(Object obj:response.getUnitinfoList()) {
			System.out.println(obj);
		
		       }
		System.out.println("size:"+response.getUnitinfoList().size());
*/

/*  负荷打印
			response.getLoadinfoList().forEach(end->{
				System.out.println(end.getName());
				System.out.println(end.getId());
				System.out.println(end.getStId());
				System.out.println(end.getVolType());
				System.out.println(end.getRunState());
				System.out.println(end.getNodeId());
				System.out.println(end.getDevId());
			});
			
			System.out.println("size:"+response.getLoadinfoList().size());
*/
/*  交流线端打印
			List<GridModelAclineend> r = response.getAclnendinfoList();
	
			if (r.size() > 0){
				r.forEach(end->{
					System.out.println(end.getName());
					System.out.println(end.getId());
					System.out.println(end.getStId());
					System.out.println(end.getAclnsegId());
					System.out.println(end.getNodeId());
				    });
				
				System.out.println("size:"+response.getAclnendinfoList().size());	
			}
			else{
		    	System.out.println("Load is not existed" );
			    System.out.println("size:"+r.size());
			}
*/

/*  交流线端打印
			List<GridModelBreaker> r = response.getBreakinfoList();
	
			if (r.size() > 0){
				r.forEach(end->{
					System.out.println(end.getName());
					System.out.println(end.getId());
					System.out.println(end.getStId());
					System.out.println(end.getVolType());
					System.out.println(end.getRunState());
					System.out.println(end.getNodeId1());
					System.out.println(end.getNodeId2());
					System.out.println(end.getBrkType());
					System.out.println(end.getCapacity());
				    });
				
				System.out.println("size:"+r.size());	
			}
			else{
		    	System.out.println("Load is not existed" );
			    System.out.println("size:"+r.size());
			}
*/	
			
/*  机组打印
			List<GridModelUnit> r = response.getUnitinfoList();
	
			if (r.size() > 0){
				r.forEach(end->{
					System.out.println(end.getName());
					System.out.println(end.getId());
					System.out.println(end.getStId());
					System.out.println(end.getVolType());
					System.out.println(end.getRunState());
					System.out.println(end.getGnType());
					System.out.println(end.getMvaRate());
					System.out.println(end.getPmax());
					System.out.println(end.getQmax());
					System.out.println(end.getPmin());
					System.out.println(end.getQmin());
					System.out.println(end.getPsa());
					System.out.println(end.getPfType());
					System.out.println(end.getNodeId());
					System.out.println(end.getX0());
					System.out.println(end.getX2());
					System.out.println(end.getXdpp());
				    });
				
				System.out.println("size:"+r.size());	
			}

			else{
		    	System.out.println("Load is not existed" );
			    System.out.println("size:"+r.size());
			}
*/	
/*  容抗器打印
			List<GridModelCp> r = response.getCpinfoList();
	
			if (r.size() > 0){
				r.forEach(end->{
					System.out.println(end.getName());
					System.out.println(end.getId());
					System.out.println(end.getStId());
					System.out.println(end.getVolType());
					System.out.println(end.getRunState());
					System.out.println(end.getType());
					System.out.println(end.getMvaRate());
					System.out.println(end.getVRate());
					System.out.println(end.getNodeId());
					System.out.println(end.getX0());
				    });
				
				System.out.println("size:"+r.size());	
			}
			else{
		    	System.out.println("Load is not existed" );
			    System.out.println("size:"+r.size());
			}
*/			
/*  电网区域信息（调度机构）打印
			List<GridModelArea> r = response.getDivinfoList();
	
			if (r.size() > 0){
				r.forEach(end->{
					System.out.println(end.getName());
					System.out.println(end.getId());
					System.out.println(end.getParent());
					System.out.println(end.getLevel());
					System.out.println(end.getModelFg());
				    });
				
				System.out.println("size:"+r.size());	
			}

			else{
		    	System.out.println("Load is not existed" );
			    System.out.println("size:"+r.size());
			}
*/	
/*  厂站打印
			List<GridModelSubstation> r = response.getStinfoList();
	
			if (r.size() > 0){
				r.forEach(end->{
					System.out.println(end.getName());
					System.out.println(end.getId());
					System.out.println(end.getStType());
					System.out.println(end.getVolType());
					System.out.println(end.getModelFg());
				    });
				
				System.out.println("size:"+r.size());	
			}
			else{
		    	System.out.println("Load is not existed" );
			    System.out.println("size:"+r.size());
			}
*/	
/*  母线打印
			List<GridModelElcBus> r = response.getElcbusinfoList();
	
			if (r.size() > 0){
				r.forEach(end->{
					System.out.println(end.getName());
					System.out.println(end.getId());
					System.out.println(end.getStId());
					System.out.println(end.getVolType());
					System.out.println(end.getRunState());
					System.out.println(end.getBsType());
					System.out.println(end.getVmax());
					System.out.println(end.getVmin());
					System.out.println(end.getNodeId());
				    });
				
				System.out.println("size:"+r.size());	
			}
			else{
		    	System.out.println("Load is not existed" );
			    System.out.println("size:"+r.size());
			}
*/		
/*  开关打印
			List<GridModelBreaker> r = response.getBreakinfoList();
	
			if (r.size() > 0){
				r.forEach(end->{
					System.out.println(end.getName());
					System.out.println(end.getId());
					System.out.println(end.getStId());
					System.out.println(end.getVolType());
					System.out.println(end.getRunState());
					System.out.println(end.getNodeId1());
					System.out.println(end.getNodeId2());
					System.out.println(end.getBrkType());
					System.out.println(end.getCapacity());
				    });
				
				System.out.println("size:"+r.size());	
			}
			else{
		    	System.out.println("Load is not existed" );
			    System.out.println("size:"+r.size());
			}
*/				
/*  刀闸打印
			List<GridModelDis> r = response.getDisinfoList();
	
			if (r.size() > 0){
				r.forEach(end->{
					System.out.println(end.getName());
					System.out.println(end.getId());
					System.out.println(end.getStId());
					System.out.println(end.getVolType());
					System.out.println(end.getRunState());
					System.out.println(end.getNodeId1());
					System.out.println(end.getNodeId2());
				    });
				
				System.out.println("size:"+r.size());	
			}
			else{
		    	System.out.println("Load is not existed" );
			    System.out.println("size:"+r.size());
			}
*/		
///*  负荷打印
			List<GridModelLoad> r = response.getLoadinfoList();
	
			if (r.size() > 0){
				r.forEach(end->{
					System.out.println(end.getName());
					System.out.println(end.getId());
					System.out.println(end.getStId());
					System.out.println(end.getVolType());
					System.out.println(end.getRunState());
					System.out.println(end.getNodeId());
//					System.out.println(end.getGrddisType());
				    });
				
				System.out.println("size:"+r.size());	
			}
			else{
		    	System.out.println("Load is not existed" );
			    System.out.println("size:"+r.size());
			}
//*/		
		}

		
	}
	
}
	private static void cacheData(Set<Long> keySet, GridModelResponse response) {
		cacheData(keySet, response.getAclnendinfoList());
		cacheData(keySet, response.getBreakinfoList());
		cacheData(keySet, response.getDisinfoList());
		cacheData(keySet, response.getCpinfoList());
		cacheData(keySet, response.getCvtinfoList());
		cacheData(keySet, response.getDcdisinfoList());
		cacheData(keySet, response.getDclineendinfoList());
		cacheData(keySet, response.getDisbrkinfoList());
		cacheData(keySet, response.getElcbusinfoList());
		cacheData(keySet, response.getLoadinfoList());
		cacheData(keySet, response.getScpinfoList());
		cacheData(keySet, response.getUnitinfoList());
		cacheData(keySet, response.getXfwdinfoList());
		
	}
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
	


