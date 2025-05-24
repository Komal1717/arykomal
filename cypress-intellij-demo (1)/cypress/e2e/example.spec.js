describe('Wikipedia Homepage Test', () => {
  it('Visits Wikipedia and checks the title', () => {
    cy.visit('/');
    cy.title().should('include', 'Wikipedia');
  });
});