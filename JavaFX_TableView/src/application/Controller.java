package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller implements Initializable {
	
	@FXML
	public TableView<Board> boardTableView;
	
	@FXML
	public TableColumn<Board, Integer> colNo;
	@FXML
	public TableColumn<Board, String> colTitle;
	@FXML
	public TableColumn<Board, String> colWriter;
	@FXML
	public TableColumn<Board, String> colRegDate;
	@FXML
	public TableColumn<Board, String> colView;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		Board board1 = new Board("제목1", "작성자1", "내용1");
		Board board2 = new Board("제목2", "작성자2", "내용2");
		Board board3 = new Board("제목3", "작성자3", "내용3");
		
//		ArrayList<Board> boardList = new ArrayList<Board>(); 메인에서 static으로 선언한 걸 그대로 가져온다.
		if( Main.boardList.size() == 0 ) {
			Main.boardList.add(board1);	// Main을 붙여준다.
			Main.boardList.add(board2);
			Main.boardList.add(board3);
		}
		
		// * TableCoulmn 에 Board 객체의 게터 이름 지정하기
		// setCellValueFactory() 				: 셀의 값을 지정하는 메소드
		// new PropertyValueFactory("게터이름")	: 값으로 들어갈 객체의 게터 이름을 지정하는 객체
		// ** 게터이름 : getXXX
		// ex) getNo() --> No
		// ※ modul-info.java --> java.base 모듈 추가해야 사용 가능
		colNo.setCellValueFactory(new PropertyValueFactory<>("No"));
		colTitle.setCellValueFactory(new PropertyValueFactory<>("Title"));
		colWriter.setCellValueFactory(new PropertyValueFactory<>("Writer"));
		colRegDate.setCellValueFactory(new PropertyValueFactory<>("RegDate"));
		colView.setCellValueFactory(new PropertyValueFactory<>("View"));
		
		// 테이블뷰에 데이터 추가하기
		ObservableList<Board> list = FXCollections.observableArrayList(
//				board1, board2, board3
				Main.boardList
		);
		
		boardTableView.setItems(list);
	}
	
	// 글쓰기 클릭 메소드
	public void moveToInsert(ActionEvent event) throws IOException {
		System.out.println("글쓰기 화면으로 이동합니다.");
		Main.setRoot("Insert"); 	// Insert.fxml 화면으로 이동
	}

}
