package com.atoz.survey.po;
/**
 * JavaBean��Paper
 * 
 * @author SingleX
 *
 */
public class Paper {
	private int paperId;//�ʾ�ID��
	private String paperTitle;//�ʾ����
	private String paperSummary;//�ʾ�ժҪ����
	private String paperStartDate;//�ʾ�������
	private String paperEndDate;//�ʾ��������
	private String paperBg;//�ʾ���ͼƬ�洢·��
	private int paperType;//�ʾ����
	private int paperStatus;//�ʾ�״̬
	private int paperCount;//�ʾ�ش����
	
	public int getPaperId() {
		return paperId;
	}
	public void setPaperId(int paperId) {
		this.paperId = paperId;
	}
	public String getPaperTitle() {
		return paperTitle;
	}
	public void setPaperTitle(String paperTitle) {
		this.paperTitle = paperTitle;
	}
	public String getPaperSummary() {
		return paperSummary;
	}
	public void setPaperSummary(String paperSummary) {
		this.paperSummary = paperSummary;
	}
	public String getPaperStartDate() {
		return paperStartDate;
	}
	public void setPaperStartDate(String paperStartDate) {
		this.paperStartDate = paperStartDate;
	}
	public String getPaperEndDate() {
		return paperEndDate;
	}
	public void setPaperEndDate(String paperEndDate) {
		this.paperEndDate = paperEndDate;
	}
	public String getPaperBg() {
		return paperBg;
	}
	public void setPaperBg(String paperBg) {
		this.paperBg = paperBg;
	}
	public int getPaperCount() {
		return paperCount;
	}
	public void setPaperCount(int paperCount) {
		this.paperCount = paperCount;
	}
	public int getPaperType() {
		return paperType;
	}
	public void setPaperType(int paperType) {
		this.paperType = paperType;
	}
	public int getPaperStatus() {
		return paperStatus;
	}
	public void setPaperStatus(int paperStatus) {
		this.paperStatus = paperStatus;
	}
}
