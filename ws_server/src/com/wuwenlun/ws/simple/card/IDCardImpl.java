package com.wuwenlun.ws.simple.card;

import javax.jws.WebService;

@WebService
public class IDCardImpl implements IDCardInterface {

	@Override
	public IDCard getInfoById(String idCard) {
		if(null == idCard && idCard.equals("")) return null;
		IDCard card = new IDCard();
		card.setId(idCard);
		card.setName("ÎâÎÄÂ×");
		card.setAge(18);
		return card;
	}

}
