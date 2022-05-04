package team.os.test;

import java.util.LinkedList;
import java.util.List;

import team.os.model.Core;
import team.os.model.ECore;
import team.os.model.PCore;
import team.os.model.Process;
import team.os.scheduling.SRTN;

public class TestSRTN {

	public static void main(String[] args) {
		List<Process> processList = new LinkedList<>();
		processList.add(new Process(0,0,7));
		processList.add(new Process(1,0,7));
		processList.add(new Process(2,0,7));
		processList.add(new Process(3,0,5));
		processList.add(new Process(4,0,7));
		processList.add(new Process(5,0,7));
		processList.add(new Process(6,0,9));
		processList.add(new Process(7,0,7));
		processList.add(new Process(8,2,3));
		processList.add(new Process(9,2,3));
		processList.add(new Process(10,2,3));
		processList.add(new Process(11,2,3));
		
		List<Core> coreList = new LinkedList<Core>();
		coreList.add(new PCore());
		coreList.add(new PCore());
		coreList.add(new PCore());
		coreList.add(new PCore());
		
		new SRTN().schedule(processList, coreList);

	}

}
