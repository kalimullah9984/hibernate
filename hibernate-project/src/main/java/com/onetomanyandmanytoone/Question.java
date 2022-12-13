package com.onetomanyandmanytoone;
	import javax.persistence.Entity;
	import javax.persistence.Id;
import javax.persistence.OneToMany;
	import java.util.*;

	@Entity
	public class Question {
		@Id
		private int questionId;
		private String question;
		@OneToMany(mappedBy="question")
		private List<Answer>answers;

		public int getQuestionId() {
			return questionId;
		}

		public void setQuestionId(int questionId) {
			this.questionId = questionId;
		}

		public String getQuestion() {
			return question;
		}

		public void setQuestion(String question) {
			this.question = question;
		}
		public List<Answer> getAnswers() {
			return answers;
		}
		public void setAnswers(List<Answer> answers) {
			this.answers = answers;
		}
		public Question(int questionId, String question, List<Answer> answers) {
			super();
			this.questionId = questionId;
			this.question = question;
			this.answers = answers;
		}

		public Question() {
			super();

		}
		@Override
		public String toString() {
			return "Question [questionId=" + questionId + ", question=" + question + ", answers=" + answers + "]";
		}
		
		}

	


